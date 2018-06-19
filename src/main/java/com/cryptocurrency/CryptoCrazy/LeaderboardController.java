package com.cryptocurrency.CryptoCrazy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cryptocurrency.CryptoCrazy.dao.LeaderboardRepo;
import com.cryptocurrency.CryptoCrazy.model.Leaderboard;



@Controller
public class LeaderboardController {
	
	@Autowired
	LeaderboardRepo lr;
	
	
	@RequestMapping("/leaderboard") // can get either getmapping or requestmapping not postmapping here tho
	public ModelAndView index() {
		List<Leaderboard> leaderBoard = new ArrayList<>();
		leaderBoard = lr.findAll();
		Collections.sort(leaderBoard);
		Collections.reverse(leaderBoard);
		System.out.println(leaderBoard);
		ModelAndView mv = new ModelAndView("leaderboard","leaderlist", leaderBoard); // page of the jsp that should be returned

		return mv;
	

}
}
