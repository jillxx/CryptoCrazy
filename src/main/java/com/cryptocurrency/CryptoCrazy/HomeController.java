/**
 * @author Jill Xu, John Aoraha, Mike DeCoopman
 * @since 6/15/2018
 * Description: Web game imitate the crypto currency trade in the history
 *
 */
package com.cryptocurrency.CryptoCrazy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.cryptocurrency.CryptoCrazy.dao.LeaderboardRepo;
import com.cryptocurrency.CryptoCrazy.model.Crypto;
import com.cryptocurrency.CryptoCrazy.model.Leaderboard;




@Controller
// @SessionAttributes is used on a controller to designate which model
// attributes should be stored in the session.
@SessionAttributes("endDate")
public class HomeController {
	public static BigDecimal moneyOnHold = new BigDecimal("1000.00");
	public static int counter;
	public static Leaderboard lb;
	public static int dateCounter;

	// @Autowired
	// public LeaderboardDao leaderdao;
	@Autowired
	LeaderboardRepo lp;

	@RequestMapping("/") // can get either getmapping or requestmapping not postmapping here tho

	public ModelAndView index() {
		moneyOnHold = new BigDecimal("1000.00");
		dateCounter = 0;

		ModelAndView mv = new ModelAndView("welcome"); // page of the jsp that should be returned

		return mv;

	}

	@RequestMapping("addplayer")
	public ModelAndView addPlayer(@RequestParam("name") String name, @RequestParam("mode") String mode) {

		moneyOnHold.setScale(2, BigDecimal.ROUND_HALF_UP);
		// System.out.println(moneyOnHold);
		// adding new player to the leader board
		lb = new Leaderboard(name, moneyOnHold, mode);
		lp.save(lb);
		// set up the allowed loop number based on mode
		if (mode.equalsIgnoreCase("easy")) {
			counter = 3;
		} else if (mode.equalsIgnoreCase("medium")) {
			counter = 5;
		} else if (mode.equalsIgnoreCase("difficult")) {
			counter = 7;
		} else {
			counter = (int) Integer.MAX_VALUE;// FIXME: not working.infinity number
		}

		return new ModelAndView("index");
	}

	@RequestMapping("pricechange")
	public ModelAndView priceChange(@RequestParam("currency") String currencyType, @RequestParam("date1") String date1,
			@RequestParam("date2") String date2, HttpSession session, Model model) {
		int currencyid = 0;
		String twitterlink = null;

		// calling the method to convert the date string to a long timestamp
		Long timeStampStart = convertStringToTimestamp(date1);
		Long timeStampEnd = convertStringToTimestamp(date2);

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
			currencyid = 321992;
			twitterlink = "<a class=\"twitter-timeline\" href=\"https://twitter.com/CardanoStiftung?ref_src=twsrc%5Etfw\">Tweets by CardanoStiftung</a> <script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>";	
			break;
		case "BCH":
			pricestart = price1.getBody().getBCH().getUSD();
			priceend = price2.getBody().getBCH().getUSD();
			currencyid = 202330;
			twitterlink = "<a class=\"twitter-timeline\" href=\"https://twitter.com/BitcoinCashFans?ref_src=twsrc%5Etfw\">Tweets by BitcoinCashFans</a> <script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>";
			break;
		case "BTC":
			pricestart = price1.getBody().getBTC().getUSD();
			priceend = price2.getBody().getBTC().getUSD();
			currencyid = 1182;
			twitterlink = "<a class=\"twitter-timeline\" href=\"https://twitter.com/TheBitcoinNews?ref_src=twsrc%5Etfw\">Tweets by TheBitcoinNews</a> <script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>";
			break;
		case "BNB":
			pricestart = price1.getBody().getBNB().getUSD();
			priceend = price2.getBody().getBNB().getUSD();
			currencyid = 204788;
			twitterlink = "<a class=\"twitter-timeline\" href=\"https://twitter.com/binance?ref_src=twsrc%5Etfw\">Tweets by Binance</a> <script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>";
			
			break;
		case "DASH":
			pricestart = price1.getBody().getDASH().getUSD();
			priceend = price2.getBody().getDASH().getUSD();
			currencyid = 3807;
			twitterlink = "<a class=\"twitter-timeline\" href=\"https://twitter.com/Dashpay?ref_src=twsrc%5Etfw\">Tweets by Dashpay</a> <script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>";
			break;
		case "EOS":
			pricestart = price1.getBody().getEOS().getUSD();
			priceend = price2.getBody().getEOS().getUSD();
			currencyid = 166503;
			twitterlink = "<a class=\"twitter-timeline\" href=\"https://twitter.com/EOS_io?ref_src=twsrc%5Etfw\">Tweets by EOS_io</a> <script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>";
			break;
		case "ETC":
			pricestart = price1.getBody().getETC().getUSD();
			priceend = price2.getBody().getETC().getUSD();
			currencyid = 5324;
			twitterlink = "<a class=\"twitter-timeline\" href=\"https://twitter.com/eth_classic?ref_src=twsrc%5Etfw\">Tweets by eth_classic</a> <script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>";
			break;
		case "ETH":
			pricestart = price1.getBody().getETH().getUSD();
			priceend = price2.getBody().getETH().getUSD();
			currencyid = 7605;
			twitterlink ="<a class=\"twitter-timeline\" href=\"https://twitter.com/ethereum?ref_src=twsrc%5Etfw\">Tweets by ethereum</a> <script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>";
			break;
		case "IOT":
			pricestart = price1.getBody().getIOT().getUSD();
			priceend = price2.getBody().getIOT().getUSD();
			currencyid = 127356;
			twitterlink = "<a class=\"twitter-timeline\" href=\"https://twitter.com/iotatoken?ref_src=twsrc%5Etfw\">Tweets by iotatoken</a> <script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>";
			break;
		case "LTC":
			pricestart = price1.getBody().getLTC().getUSD();
			priceend = price2.getBody().getLTC().getUSD();
			currencyid = 3808;
			twitterlink = "<a class=\"twitter-timeline\" href=\"https://twitter.com/LitecoinProject?ref_src=twsrc%5Etfw\">Tweets by LitecoinProject</a> <script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>";
			break;
		case "NEO":
			pricestart = price1.getBody().getNEO().getUSD();
			priceend = price2.getBody().getNEO().getUSD();
			currencyid = 27368;
			twitterlink = "<a class=\"twitter-timeline\" href=\"https://twitter.com/NEO_Blockchain?ref_src=twsrc%5Etfw\">Tweets by NEO_Blockchain</a> <script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>";
			break;
		case "OMG":
			pricestart = price1.getBody().getOMG().getUSD();
			priceend = price2.getBody().getOMG().getUSD();
			currencyid = 187440;
			twitterlink = "<a class=\"twitter-timeline\" href=\"https://twitter.com/omise_go?ref_src=twsrc%5Etfw\">Tweets by omise_go</a> <script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>";
			break;
		case "QTUM":
			pricestart = price1.getBody().getQTUM().getUSD();
			priceend = price2.getBody().getQTUM().getUSD();
			currencyid = 112392;
			twitterlink = "<a class=\"twitter-timeline\" href=\"https://twitter.com/QtumOfficial?ref_src=twsrc%5Etfw\">Tweets by QtumOfficial</a> <script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>";
			break;
		case "TRX":
			pricestart = price1.getBody().getTRX().getUSD();
			priceend = price2.getBody().getTRX().getUSD();
			currencyid = 310829;
			twitterlink = "<a class=\"twitter-timeline\" href=\"https://twitter.com/Tronfoundation?ref_src=twsrc%5Etfw\">Tweets by Tronfoundation</a> <script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>";
			break;
		case "USDT":
			pricestart = price1.getBody().getUSDT().getUSD();
			priceend = price2.getBody().getUSDT().getUSD();
			currencyid = 171986;
			twitterlink = "<a class=\"twitter-timeline\" href=\"https://twitter.com/Tether_to?ref_src=twsrc%5Etfw\">Tweets by Tether_to</a> <script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>";
			break;
		case "VEN":
			pricestart = price1.getBody().getVEN().getUSD();
			priceend = price2.getBody().getVEN().getUSD();
			currencyid = 236131;
			twitterlink = "<a class=\"twitter-timeline\" href=\"https://twitter.com/vechainofficial?ref_src=twsrc%5Etfw\">Tweets by vechainofficial</a> <script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>";
			break;
		case "XEM":
			pricestart = price1.getBody().getXEM().getUSD();
			priceend = price2.getBody().getXEM().getUSD();
			currencyid = 5285;
			twitterlink = "<a class=\"twitter-timeline\" href=\"https://twitter.com/NEMofficial?ref_src=twsrc%5Etfw\">Tweets by NEMofficial</a> <script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>";
			break;
		case "XLM":
			pricestart = price1.getBody().getXLM().getUSD();
			priceend = price2.getBody().getXLM().getUSD();
			currencyid = 4614;
			twitterlink = "<a class=\"twitter-timeline\" href=\"https://twitter.com/StellarOrg?ref_src=twsrc%5Etfw\">Tweets by StellarOrg</a> <script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>";
			break;
		case "XMR":
			pricestart = price1.getBody().getXMR().getUSD();
			priceend = price2.getBody().getXMR().getUSD();
			currencyid = 5038;
			twitterlink = "<a class=\"twitter-timeline\" href=\"https://twitter.com/monerocurrency?ref_src=twsrc%5Etfw\">Tweets by monerocurrency</a> <script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>";
			break;
		case "XRP":
			pricestart = price1.getBody().getXRP().getUSD();
			priceend = price2.getBody().getXRP().getUSD();
			currencyid = 5031;
			twitterlink = "<a class=\"twitter-timeline\" href=\"https://twitter.com/Ripple?ref_src=twsrc%5Etfw\">Tweets by Ripple</a> <script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>";
			break;
		}

		// getting all the information from the snapshot url
		ResponseEntity<Crypto> currencydetail = restTemplate.exchange(
				"https://www.cryptocompare.com/api/data/coinsnapshotfullbyid/?id=" + currencyid, HttpMethod.GET, entity,
				Crypto.class);
		String name = currencydetail.getBody().getData().getGeneral().getName();
		String imageUrl = currencydetail.getBody().getData().getGeneral().getImageUrl();
		String description = currencydetail.getBody().getData().getGeneral().getDescription();
		String startDate = currencydetail.getBody().getData().getGeneral().getStartDate();

		// direct back to the index page if date is before the previous date.
		if (dateCounter == 0) {
			model.addAttribute("endDate", timeStampEnd);
		} else {
			System.out.println("before" + session.getAttribute("endDate"));
			if (timeStampStart <= Long.valueOf(session.getAttribute("endDate").toString())) {
				ModelAndView mverror = new ModelAndView("index");

				// transfer the timeStamp to formated date for error message
				java.util.Date dateTime = new java.util.Date((long) session.getAttribute("endDate") * 1000);
				System.out.println("showed date " + dateTime);
				DateFormat f = new SimpleDateFormat("yyyy-MM-dd");

				String emessage = "You can't go backwards! Your last sell date was " + f.format(dateTime) + ".";
				// System.out.println("The start time is before the last end date");
				return mverror.addObject("errormessage", emessage);
			}
			model.addAttribute("endDate", timeStampEnd);
		}
		dateCounter++;

		if (pricestart == 0.0) {
			ModelAndView mverror = new ModelAndView("index");
			String emessage = "No price data available for " + currencyType + " on " + date1 + ".";
			return mverror.addObject("errormessage", emessage);
		}

		// difference between two prices
		double pricedifference = priceend - pricestart;
		System.out.println("pricedifference: " + pricedifference);
		double percentChange = ((pricedifference) / pricestart) + 1;

//		// casting the double price to big decimal
//		BigDecimal pricediff = BigDecimal.valueOf(pricedifference);

		// casting to number has two decimal places
		BigDecimal percentage = BigDecimal.valueOf(percentChange);
		System.out.println("percentage: " + percentage);
		System.out.println("original money: " + moneyOnHold);
		// calculate the money left after this investment loop.
		moneyOnHold = moneyOnHold.multiply(percentage).setScale(2, RoundingMode.HALF_UP);
		System.out.println("moneyonhold: " + moneyOnHold);

		// casting percentage difference format
		BigDecimal percentagechange = percentage.subtract(new BigDecimal("1"));
		percentagechange = percentagechange.scaleByPowerOfTen(2).setScale(2, RoundingMode.HALF_UP);
		System.out.println("percentagechange: " + percentagechange);

		counter--;
		System.out.println(counter);
		// update the pojo
		lb.setScore(moneyOnHold);
		lp.save(lb);

		// String test = "price start is: "+ pricestart;
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		String moneyString1 = formatter.format(pricestart);
		String moneyString2 = formatter.format(priceend);
		String moneyString3 = formatter.format(moneyOnHold);
		System.out.println("imageUrl"+imageUrl);
		if (pricedifference > 0) {
			ModelAndView view1 = new ModelAndView("mademoney");

			return view1.addObject("pricestart", moneyString1).addObject("priceend", moneyString2)
					.addObject("percent", percentagechange).addObject("money", moneyString3)
					.addObject("counter", counter).addObject("name", name).addObject("image", imageUrl)
					.addObject("description", description).addObject("startdate", startDate).addObject("link",twitterlink);

		}

		else {
			ModelAndView view2 = new ModelAndView("lostmoney");
			return view2.addObject("pricestart", moneyString1).addObject("priceend", moneyString2)
					.addObject("percent", percentagechange).addObject("money", moneyString3)
					.addObject("counter", counter).addObject("name", name).addObject("image", imageUrl)
					.addObject("description", description).addObject("startdate", startDate).addObject("link",twitterlink);
		}

	}

	@RequestMapping("continue")
	public ModelAndView cont() {
		if (counter == 0) {
			// show different list base on mode
			List<Leaderboard> leaderBoard = new ArrayList<>();
			leaderBoard = lp.findByMode(lb.getMode());

			Collections.sort(leaderBoard);
			Collections.reverse(leaderBoard);

			BigDecimal percentage = moneyOnHold.divide(new BigDecimal(10.0)).subtract(new BigDecimal(100.00));
			System.out.println(percentage);
			ModelAndView mvl = new ModelAndView("leaderboard");
			mvl.addObject("leaderlist", leaderBoard).addObject("mode", lb.getMode())
					.addObject("finalmoney", moneyOnHold).addObject("percentage", percentage);
			return mvl;

		}

		return new ModelAndView("index");
	}

	// date type transfer method
	public static Long convertStringToTimestamp(String str_date) {
		try {
			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

			Long date = formatter.parse(str_date).getTime();
			Long timeStampDate = date / 1000;

			return timeStampDate;
		} catch (ParseException e) {
			System.out.println("Exception :" + e);
			return null;
		}
	}

	// determine if the date is not backward

}
