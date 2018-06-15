package com.cryptocurrency.CryptoCrazy.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BNB {
	
	@JsonProperty("USD")
	private double USD;

	public BNB() {
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
		return "BNB [USD=" + USD + "]";
	}
	
	
}
