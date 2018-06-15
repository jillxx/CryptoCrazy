package com.cryptocurrency.CryptoCrazy.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QTUM {
	
	@JsonProperty("USD")
	private double USD;

	public QTUM() {
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
		return "QTUM [USD=" + USD + "]";
	}
	
	
}
