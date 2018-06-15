package com.cryptocurrency.CryptoCrazy;

import java.util.Date;

import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.cryptocurrency.CryptoCrazy.model.Crypto;


@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView ("index");
	}
	
	@RequestMapping("pricechange")
	public ModelAndView Price(@RequestParam("crypto") String crypto, @RequestParam("dateStart") Date dateStart, @RequestParam("dateEnd") Date dateEnd) {
	
		RestTemplate restTemplate = new RestTemplate();
		Crypto price1 = restTemplate.getForObject("https://min-api.cryptocompare.com/data/pricehistorical?fsym=BCH&tsyms=USD&ts=1525910400", Crypto.class);
//		Crypto price2 = restTemplate.getForObject("https://min-api.cryptocompare.com/data/pricehistorical?fsym=BCH&tsyms=USD&ts=1527638400", Crypto.class);
//		double pricechange = price1 - price2;
		
		System.out.println(price1);
		return new ModelAndView("index", "crypto", price1); // page, expressions language tag reference, object
																		// you want to send back in
	}
	
}
