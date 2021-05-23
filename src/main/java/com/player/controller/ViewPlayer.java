package com.player.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

import com.player.dao.PlayerDao;

import com.player.dao.impl.PlayerDaoImpl;
import com.player.exception.ConnectionUtilityException;
import com.player.model.Player;

public class ViewPlayer extends HttpServlet {
	static PlayerDao da;

	public ViewPlayer() {
		super();
		da = new PlayerDaoImpl();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		List<Player> list = null;
		Map<Integer, String> map = new HashMap<>();
		PrintWriter out = response.getWriter();
		String teamname = request.getParameter("teamname");

		Player player = new Player();
		player.setTeamname(teamname);

		out.println("<h1>Player List</h1>");

		try {
			list = da.getPlayerByTeamName(player);

		} catch (ConnectionUtilityException | SQLException e) {
			System.err.println(e.getMessage());

		}

		for (Player mp : list) {
			map.put(mp.getPlayerid(), mp.getPlayername());
		}
//		out.print(map);
//		
//		Iterator <Integer> it = map.keySet().iterator();  
//		while(it.hasNext()) {
//			int key=(int)it.next();  
//			out.print("Player Id:  "+key+"     name:   "+map.get(key)); 
//		}

		Map<Integer, String> smap = sortValues(map);
		System.out.println("\n");
		System.out.println("After Sorting:");
		Set set2 = smap.entrySet();
		Iterator iterator2 = set2.iterator();
		out.print("<table border='1' width=100%>");
		out.print("<tr><th>ID</th><th>Name</th>");
		while (iterator2.hasNext()) {
			Map.Entry me2 = (Map.Entry) iterator2.next();
			out.print("<tr><td>" + me2.getKey() + "</td><td>" + me2.getValue() + "</td></tr>");
			// out.print("Playerids: "+me2.getKey()+" Name: "+me2.getValue());
		}

//		out.print("<table border='1' width=100%>");
//		out.print("<tr><th>ID</th><th>Name</th><th>Age</th><th>Gender</th><th>Teamname</th>");
//		for (Player p : list) {
//			out.print("<tr><td>" + p.getPlayerid() + "</td><td>" + p.getPlayername() + "</td><td>" + p.getAge()
//					+ "</td><td>" + p.getGender() + "</td><td>" + p.getTeamname() + "</td></tr>");
//		}
	}

	// method to sort values
	private static HashMap sortValues(Map<Integer, String> map) {
		List list = new LinkedList(map.entrySet());
		// Custom Comparator
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
			}
		});
		// copying the sorted list in HashMap to preserve the iteration order
		HashMap sortedHashMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		return sortedHashMap;
	}

}
