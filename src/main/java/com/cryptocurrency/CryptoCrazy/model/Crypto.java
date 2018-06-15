package com.cryptocurrency.CryptoCrazy.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Crypto {
	
	@JsonProperty("BTC")
	private BTC BTC;


	public Crypto() {
		// TODO Auto-generated constructor stub
	}


	public BTC getBTC() {
		return BTC;
	}


	public void setBTC(BTC bTC) {
		BTC = bTC;
	}


	@Override
	public String toString() {
		return "Crypto [BTC=" + BTC + "]";
	}

	
}
