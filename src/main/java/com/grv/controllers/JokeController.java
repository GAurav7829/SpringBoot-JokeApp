package com.grv.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.grv.services.JokeService;

@Controller
public class JokeController {
	private final JokeService jokeService;

	public JokeController(JokeService jokeService) {
		super();
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/",""})
	public String showJoke(Model model) {
		model.addAttribute("joke", jokeService.getJoke());
		return "index";
	}
	
	@ResponseBody
	@RequestMapping(value = "/getJoke", method = RequestMethod.GET)
	public String getJoke() {
		return jokeService.getJoke();
	}
}
