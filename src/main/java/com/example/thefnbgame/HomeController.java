package com.example.thefnbgame;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping()
    public String index() {
        return "index";
    }
    @GetMapping("/game.html")
    public String game(){
        return "game";
    }
}
