package guru.springframework.spring5jokes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5jokes.services.ChuckService;

@Controller
public class JokesController {

    @Autowired
    private ChuckService chuckService;

    @RequestMapping({"/", ""})
    public String getJokes(Model model) {
        model.addAttribute("joke", chuckService.getJoke());
        return "jokes";
    }
}
