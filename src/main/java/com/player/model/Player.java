package com.player.model;

public class Player {

	private int playerid;
	private String playername;
	private byte age;
	private String gender;
	private String teamname;

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(int playerid, String playername, byte age, String gender, String teamname) {
		super();
		this.playerid = playerid;
		this.playername = playername;
		this.age = age;
		this.gender = gender;
		this.teamname = teamname;
	}

	public int getPlayerid() {
		return playerid;
	}

	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

}
