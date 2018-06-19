package com.cryptocurrency.CryptoCrazy.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "leaderboard")

public class Leaderboard implements Comparable<Leaderboard> {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private int id;
	private String name;
	private BigDecimal score;
	private String mode;
	
	public Leaderboard() {
		
	}
	
	




	public Leaderboard(String name, BigDecimal score, String mode) {
		super();
		this.name = name;
		this.score = score;
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

	public BigDecimal getScore() {
		return score;
	}

	public void setScore(BigDecimal score) {
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
	
	
	@Override
	public int compareTo(Leaderboard l) {
		
		return getScore().compareTo(l.getScore());
	}

	

}


