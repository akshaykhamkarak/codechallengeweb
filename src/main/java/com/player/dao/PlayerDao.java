package com.player.dao;

import java.sql.SQLException;
import java.util.List;

import com.player.exception.ConnectionUtilityException;
import com.player.exception.DuplicateDataException;
import com.player.model.Player;

public interface PlayerDao {

	 List<Player> getPlayerByTeamName(Player player) throws SQLException,ConnectionUtilityException;

	 int addPlayer(Player player) throws SQLException,DuplicateDataException;
	
}
