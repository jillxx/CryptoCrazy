package com.cryptocurrency.CryptoCrazy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cryptocurrency.CryptoCrazy.model.Leaderboard;

public interface LeaderboardRepo extends JpaRepository<Leaderboard, Integer> {
	
	List<Leaderboard> findByMode(String mode);



}
