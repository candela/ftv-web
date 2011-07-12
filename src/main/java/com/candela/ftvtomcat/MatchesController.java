package com.candela.ftvtomcat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.candela.ftvtomcat.entity.Match;
import com.candela.ftvtomcat.entity.MatchList;

/**
 * REST service client
 */
@Controller
public class MatchesController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/getMatch.html", method = RequestMethod.GET)
	public ModelAndView getMatch(@RequestParam(value="id") String id) {
		String url = "http://ftv-ws.appspot.com/service/match/" + id;
		Match match = (Match) restTemplate.getForObject(url, Match.class);
		return new ModelAndView("match", "match", match);
	}

	@RequestMapping(value = "/getMatches.html", method = RequestMethod.GET)
	public ModelAndView getMatches() {
		String url = "http://ftv-ws.appspot.com/service/matches";
		MatchList matchList = (MatchList) restTemplate.getForObject(url, MatchList.class);
		return new ModelAndView("matches", "matchList", matchList);
	}

}
