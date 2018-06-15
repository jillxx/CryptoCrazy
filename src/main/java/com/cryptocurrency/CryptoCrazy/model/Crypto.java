package com.cryptocurrency.CryptoCrazy.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Crypto {
	private double USD;



	public Crypto() {
		// TODO Auto-generated constructor stub
	}

	public double getUSD() {
		return USD;
	}

	public void setUSD(double uSD) {
		USD = uSD;
	}

	@Override
	public String toString() {
		return "Crypto [USD=" + USD + "]";
	}
	
	

}
