package com.framework.ChuckNoris.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeImpl implements JokeService {
    private ChuckNorrisQuotes randomQuote;

    public JokeImpl() {
        this.randomQuote = new ChuckNorrisQuotes();
    }

    @Override
    public String sayJoke() {
        return randomQuote.getRandomQuote();
    }
}
