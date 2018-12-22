package com.example.joke.controllers;


import com.example.joke.services.JokesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokesServices jokesServices ;

    @Autowired
    public JokeController(JokesServices jokesServices) {
        this.jokesServices = jokesServices;
    }

    @RequestMapping({"/", ""})
    public  String showJoke(Model model ){
        model.addAttribute("joke", jokesServices.getJoke()) ;
        return "chucknorris" ;
    }
}
