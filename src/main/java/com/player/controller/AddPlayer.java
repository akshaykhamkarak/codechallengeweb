package com.player.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.player.dao.PlayerDao;

import com.player.dao.impl.PlayerDaoImpl;
import com.player.exception.ConnectionUtilityException;
import com.player.exception.DuplicateDataException;
import com.player.model.Player;

public class AddPlayer extends HttpServlet{
	static PlayerDao da;
	public AddPlayer() {
		super();
		da=new PlayerDaoImpl();
	
	}
	protected void doPost(HttpServletRequest request,HttpServletResponse response) 
			throws IOException, ServletException {
		int result =0;
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		String teamname=request.getParameter("teamname");
		
		String pid=request.getParameter("pid");
		int pidd=Integer.parseInt(pid);
		String age=request.getParameter("age");
		byte nage=Byte.parseByte(age);
		
		Player player=new Player();
		player.setPlayername(name);
		player.setGender(gender);
		player.setTeamname(teamname);
		player.setAge(nage);
		player.setPlayerid(pidd);
		
			
		try {
			result = da.addPlayer(player);
		} catch (DuplicateDataException | SQLException e) {
			System.err.println(e.getMessage());
			out.print(e.getMessage());
		} 
		if(result>0) {
			
		out.print("  <div class=\"alert alert-success\">\r\n"
				+ "    <strong>Success!</strong> Insert operation is success.\r\n"
				+ "  </div>");
		request.getRequestDispatcher("index.jsp").include(request, response);
		}
		else {
			out.print("  <div class=\"alert alert-danger\">\r\n"
					+ "    <strong>Danger!</strong> Fail to insert data please provide valid .\r\n"
					+ "  </div>");
			request.getRequestDispatcher("index.jsp").include(request, response);
		}
	
		out.close();
	}
	

}
