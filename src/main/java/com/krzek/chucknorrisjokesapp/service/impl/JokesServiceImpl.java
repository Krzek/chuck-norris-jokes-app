package com.krzek.chucknorrisjokesapp.service.impl;

import com.krzek.chucknorrisjokesapp.service.JokesService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
