package com.cryptocurrency.CryptoCrazy;


import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.cryptocurrency.CryptoCrazy.model.Crypto;

@Controller
public class HomeController {
	
	@RequestMapping("/")			//can get either getmapping or requestmapping not postmapping here tho
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");		//page of the jsp that should be returned
		
		
		return mv;
	
	}

	@RequestMapping("pricechange")
	public ModelAndView priceChange(@RequestParam("currency")String currencyType, @RequestParam("date1")String date1, @RequestParam("date2")String date2) {
		System.out.println(date1);
		System.out.println(date2);
		//calling the method to convert the date string to a long timestamp
		Long timeStampStart = convertStringToTimestamp(date1);
		Long timeStampEnd = convertStringToTimestamp(date2);

		ModelAndView mv = new ModelAndView("priceresult");		//page of the jsp that should be returned
		
		//adding headers to our API request
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		
		//to attach the headers to our request we need the HttpEntity
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		RestTemplate restTemplate = new RestTemplate();
		//ResponseEntity will help us get the data from the API
		ResponseEntity<Crypto> price = restTemplate.exchange("https://min-api.cryptocompare.com/data/pricehistorical?fsym="+currencyType+"&tsyms=USD&ts="+timeStampStart, HttpMethod.GET, entity, Crypto.class);
		
		//geting usd value for BTC bitcoin
		price.getBody().getBTC().getUSD();//FIXME:geting USD data for all currency
		
		
		System.out.println(price.getBody().getBTC().getUSD());  //for testing purposes
		return mv.addObject("crypto", price.getBody());
		
	}

	public static Long convertStringToTimestamp(String str_date) {
	    try {
	     
	   
	  	DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	  
			Long date = formatter.parse(str_date).getTime();
			Long timeStampDate = date/1000;
			System.out.println(timeStampDate);
	      return timeStampDate;
	    } catch (ParseException e) {
	      System.out.println("Exception :" + e);
	      return null;
	    }
	  }
}


	

