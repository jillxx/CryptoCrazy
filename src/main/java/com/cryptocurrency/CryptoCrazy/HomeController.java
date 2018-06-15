package com.cryptocurrency.CryptoCrazy;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.cryptocurrency.CryptoCrazy.model.Crypto;

@Controller
public class HomeController {
	
	@RequestMapping("/")			//can get either getmapping or requestmapping not postmapping here tho
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");		//page of the jsp that should be returned
		
		//adding headers to our API request
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		
		//to attach the headers to our request we need the HttpEntity
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		RestTemplate restTemplate = new RestTemplate();
		//ResponseEntity will help us get the data from the API
		ResponseEntity<Crypto> price = restTemplate.exchange("https://min-api.cryptocompare.com/data/pricehistorical?fsym=BTC&tsyms=USD&ts=1527638400", HttpMethod.GET, entity, Crypto.class);
		
		System.out.println(price.getBody());  //for testing purposes
		mv.addObject("crypto", price.getBody());
		
		return mv;
	
	}

}


	

