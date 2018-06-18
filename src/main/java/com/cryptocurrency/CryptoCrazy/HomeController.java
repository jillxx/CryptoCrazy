package com.cryptocurrency.CryptoCrazy;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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

	@RequestMapping("/") // can get either getmapping or requestmapping not postmapping here tho
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index"); // page of the jsp that should be returned

		return mv;

	}

	@RequestMapping("pricechange")
	public ModelAndView priceChange(@RequestParam("currency") String currencyType, @RequestParam("date1") String date1,
			@RequestParam("date2") String date2) {

		// calling the method to convert the date string to a long timestamp
		Long timeStampStart = convertStringToTimestamp(date1);
		Long timeStampEnd = convertStringToTimestamp(date2);

		ModelAndView mv = new ModelAndView("priceresult"); // page of the jsp that should be returned

		// adding headers to our API request
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);

		// to attach the headers to our request we need the HttpEntity
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		RestTemplate restTemplate = new RestTemplate();

		// ResponseEntity will help us get the data from the API
		ResponseEntity<Crypto> price1 = restTemplate
				.exchange("https://min-api.cryptocompare.com/data/pricehistorical?fsym=" + currencyType
						+ "&tsyms=USD&ts=" + timeStampStart, HttpMethod.GET, entity, Crypto.class);
		ResponseEntity<Crypto> price2 = restTemplate
				.exchange("https://min-api.cryptocompare.com/data/pricehistorical?fsym=" + currencyType
						+ "&tsyms=USD&ts=" + timeStampEnd, HttpMethod.GET, entity, Crypto.class);

		// geting usd value for currency
		double pricestart = 0.0;
		double priceend = 0.0;
		switch (currencyType) {
		case "ADA":
			pricestart = price1.getBody().getADA().getUSD();
			priceend = price2.getBody().getADA().getUSD();
			break;
		case "BCH":
			pricestart = price1.getBody().getBCH().getUSD();
			priceend = price2.getBody().getBCH().getUSD();
			break;
		case "BTC":
			pricestart = price1.getBody().getBTC().getUSD();
			priceend = price2.getBody().getBTC().getUSD();
			break;
		case "BNB":
			pricestart = price1.getBody().getBNB().getUSD();
			priceend = price2.getBody().getBNB().getUSD();
			break;
		case "DASH":
			pricestart = price1.getBody().getDASH().getUSD();
			priceend = price2.getBody().getDASH().getUSD();
			break;
		case "EOS":
			pricestart = price1.getBody().getEOS().getUSD();
			priceend = price2.getBody().getEOS().getUSD();
			break;
		case "ETC":
			pricestart = price1.getBody().getETC().getUSD();
			priceend = price2.getBody().getETC().getUSD();
			break;
		case "ETH":
			pricestart = price1.getBody().getETH().getUSD();
			priceend = price2.getBody().getETH().getUSD();
			break;
		case "IOT":
			pricestart = price1.getBody().getIOT().getUSD();
			priceend = price2.getBody().getIOT().getUSD();
			break;
		case "LTC":
			pricestart = price1.getBody().getLTC().getUSD();
			priceend = price2.getBody().getLTC().getUSD();
			break;
		case "NEO":
			pricestart = price1.getBody().getNEO().getUSD();
			priceend = price2.getBody().getNEO().getUSD();
			break;
		case "OMG":
			pricestart = price1.getBody().getOMG().getUSD();
			priceend = price2.getBody().getOMG().getUSD();
			break;
		case "QTUM":
			pricestart = price1.getBody().getQTUM().getUSD();
			priceend = price2.getBody().getQTUM().getUSD();
			break;
		case "TRX":
			pricestart = price1.getBody().getTRX().getUSD();
			priceend = price2.getBody().getTRX().getUSD();
			break;
		case "USDT":
			pricestart = price1.getBody().getUSDT().getUSD();
			priceend = price2.getBody().getUSDT().getUSD();
			break;
		case "VEN":
			pricestart = price1.getBody().getVEN().getUSD();
			priceend = price2.getBody().getVEN().getUSD();
			break;
		case "XEM":
			pricestart = price1.getBody().getXEM().getUSD();
			priceend = price2.getBody().getXEM().getUSD();
			break;
		case "XLM":
			pricestart = price1.getBody().getXLM().getUSD();
			priceend = price2.getBody().getXLM().getUSD();
			break;
		case "XMR":
			pricestart = price1.getBody().getXMR().getUSD();
			priceend = price2.getBody().getXMR().getUSD();
			break;
		case "XRP":
			pricestart = price1.getBody().getXRP().getUSD();
			priceend = price2.getBody().getXRP().getUSD();
			break;
		}
		//difference between two prices
		double pricedifference = priceend - pricestart;
		double percentChange = ((pricedifference) / pricestart) * 100;

		return mv.addObject("crypto", pricedifference).addObject("percent", percentChange);

	}

	// date type transfer method
	public static Long convertStringToTimestamp(String str_date) {
		try {
			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

			Long date = formatter.parse(str_date).getTime();
			Long timeStampDate = date / 1000;
			System.out.println(timeStampDate);
			return timeStampDate;
		} catch (ParseException e) {
			System.out.println("Exception :" + e);
			return null;
		}
	}
}
