package com.player.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.player.dao.PlayerDao;
import com.player.exception.ConnectionUtilityException;
import com.player.exception.DuplicateDataException;
import com.player.model.Player;
import com.player.utility.ConnectionUtility;

public class PlayerDaoImpl implements PlayerDao {

	public  int addPlayer(Player player) throws SQLException, DuplicateDataException{
	int result=0;
	Connection con=null;
	PreparedStatement ps=null;
	try {
		con=ConnectionUtility.getConnection();
		ps=con.prepareStatement("insert into player (pid,name,age,gender,teamname) values(?,?,?,?,?)");
		ps.setInt(1,player.getPlayerid());
		ps.setString(2,player.getPlayername());
		ps.setByte(3,player.getAge());
		ps.setString(4,player.getGender());
		ps.setString(5,player.getPlayername());
		result=ps.executeUpdate();
		
	}
	catch (Exception e) {
	throw new DuplicateDataException("Duplicate id not allow..");
	}
	finally {
		con.close();
		ps.close();
	}

		return result;
	}


	public  List<Player> getPlayerByTeamName(Player player) throws SQLException,ConnectionUtilityException{
		List<Player> list=new ArrayList<Player>();
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=ConnectionUtility.getConnection();
			ps=con.prepareStatement("select * from player where teamname=?");
			ps.setString(1,player.getTeamname());
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Player p=new Player();
				p.setPlayerid(rs.getInt(1));
				p.setPlayername(rs.getString(2));
				p.setAge(rs.getByte(3));
				p.setGender(rs.getString(4));
				p.setTeamname(rs.getString(5));
				list.add(p);
			}
		}
	catch (Exception e) {
		throw new ConnectionUtilityException("Connection not avaiable");
	}
		finally {
			con.close();
			ps.close();
		}
		
		return list;
	}


	

}
