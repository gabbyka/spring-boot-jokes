package guru.springframework.spring5jokes.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChuckService {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckService() {
        super();
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }

}
