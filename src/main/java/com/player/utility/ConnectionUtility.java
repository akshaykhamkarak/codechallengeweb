package com.player.utility;

import java.sql.Connection;
import java.sql.DriverManager;

import com.player.exception.ConnectionUtilityException;
import com.player.exception.DuplicateDataException;

public class ConnectionUtility {
private static String URL="jdbc:mysql://localhost:3307/playerregistration";
private static String USERNAME="root";
private static String PASSWORD="Trishali@1999";
  public static Connection getConnection()throws ConnectionUtilityException{
	  Connection con=null;
	  try{
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
	  }
	  catch (Exception e) {
	throw new ConnectionUtilityException("Connectivity fail....");
	}
	return con;
  }
}
