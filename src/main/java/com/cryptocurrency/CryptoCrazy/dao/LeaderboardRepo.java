package com.cryptocurrency.CryptoCrazy.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cryptocurrency.CryptoCrazy.model.Leaderboard;

public interface LeaderboardRepo extends JpaRepository<Leaderboard, Integer> {
	
	

}
