package com.cryptocurrency.CryptoCrazy.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
	@JsonProperty("General")
	private General General;

	public Data() {
		// TODO Auto-generated constructor stub
	}

	public General getGeneral() {
		return General;
	}

	public void setGeneral(General general) {
		General = general;
	}

	@Override
	public String toString() {
		return "Data [General=" + General + "]";
	}


}
