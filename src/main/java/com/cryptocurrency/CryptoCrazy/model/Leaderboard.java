package com.cryptocurrency.CryptoCrazy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "leaderboard")

public class Leaderboard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private int id;
	private String name;
	private double score;
	private String mode;
	
	public Leaderboard() {
		
	}
	
	

	public Leaderboard(String name, String mode) {
		super();
		this.name = name;
		this.mode = mode;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	
	
	@Override
	public String toString() {
		return "Leaderboard id=" + id + ", name=" + name + ", score=" + score + ", mode=" + mode;
	}
	
	
	

}


