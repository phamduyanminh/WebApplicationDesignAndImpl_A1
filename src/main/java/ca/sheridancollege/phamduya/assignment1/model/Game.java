package ca.sheridancollege.phamduya.assignment1.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
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
