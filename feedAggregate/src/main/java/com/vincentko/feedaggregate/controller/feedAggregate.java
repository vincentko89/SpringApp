package com.vincentko.feedaggregate.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vincentko.feedaggregate.form.Feed;
import com.vincentko.feedaggregate.service.FeedService;

@Controller
public class feedAggregate {

//  @RequestMapping(value="/index",method=RequestMethod.GET)
//  public ModelAndView home(HttpServletRequest request, HttpServletResponse response) {
//    
//    return new ModelAndView("home");
//  }

	@Autowired
	private FeedService feedService;
	
	@RequestMapping("/index")
	public String listFeeds(Map<String, Object> map) {

		map.put("feed", new Feed());
		map.put("feedList", feedService.listFeed());

		return "feed";
	}

} 