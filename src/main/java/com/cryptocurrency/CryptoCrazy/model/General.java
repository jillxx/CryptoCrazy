package com.cryptocurrency.CryptoCrazy.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class General {
	@JsonProperty("Name")
	private String Name;
	@JsonProperty("ImageUrl")
	private String ImageUrl;
	@JsonProperty("Description")
	private String Description;
	@JsonProperty("StartDate")
	private String StartDate;
	
	
	public General() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getImageUrl() {
		return ImageUrl;
	}
	public void setImageUrl(String imageUrl) {
		ImageUrl = imageUrl;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getStartDate() {
		return StartDate;
	}
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	
	
	@Override
	public String toString() {
		return "General [Name=" + Name + ", ImageUrl=" + ImageUrl + ", Description=" + Description + ", StartDate="
				+ StartDate + "]";
	}

	
	
	
}
