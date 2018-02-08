package guru.springframework.spring5jokes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChuckService {

    @Autowired
    private ChuckNorrisQuotes chuckNorrisQuotes;

    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }

}
