package com.cryptocurrency.CryptoCrazy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




public class LeaderboardController {
	
	@Autowired
	
	@RequestMapping("/") // can get either getmapping or requestmapping not postmapping here tho
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index"); // page of the jsp that should be returned

		return mv;
	

}
}
