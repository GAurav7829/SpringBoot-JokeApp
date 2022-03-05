package com.grv.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {
	
	private final ChuckNorrisQuotes quotes;
	
	public JokeServiceImpl() {
		this.quotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getJoke() {
		return quotes.getRandomQuote();
	}

}
