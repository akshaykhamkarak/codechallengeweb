package com.player.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

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

		out.print("<table border='1' width=100%>");
		out.print("<tr><th>ID</th><th>Name</th><th>Age</th><th>Gender</th><th>Teamname</th>");
		for (Player p : list) {
			out.print("<tr><td>" + p.getPlayerid() + "</td><td>" + p.getPlayername() + "</td><td>" + p.getAge()
					+ "</td><td>" + p.getGender() + "</td><td>" + p.getTeamname() + "</td></tr>");
		}
	}
}
