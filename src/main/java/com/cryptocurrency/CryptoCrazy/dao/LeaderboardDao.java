package com.cryptocurrency.CryptoCrazy.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cryptocurrency.CryptoCrazy.model.Leaderboard;

//import dot.com.Jcoffeeshop.entity.Person;

@Repository
@Transactional
public class LeaderboardDao {
		
		@PersistenceContext 
	
		EntityManager eManager;  
		
		
		public Leaderboard add(Leaderboard L) {
			return eManager.merge(L);
		}

	}


