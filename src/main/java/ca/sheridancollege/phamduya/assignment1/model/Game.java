package ca.sheridancollege.phamduya.assignment1.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Game {
    @GetMapping("/")
    public String index(){
        return "Input";
    }

    @PostMapping("/processInput")
    public String display(){
        return "Output";
    }
}
