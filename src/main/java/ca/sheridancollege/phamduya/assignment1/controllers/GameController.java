package ca.sheridancollege.phamduya.assignment1.controllers;

import ca.sheridancollege.phamduya.assignment1.model.RockPapperScissors;
import ca.sheridancollege.phamduya.assignment1.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {
    User user = new User();

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("user", user);
        return "Input";
    }

    @PostMapping("/processInput")
    public String display(Model model, @RequestParam String option, User user){
        System.out.println(option);
        model.addAttribute("user", user);
        RockPapperScissors rps = new RockPapperScissors();
        rps.setUserChoice(user.getOption());
        rps.gameResult();
        model.addAttribute("rps", rps);
        return "Output";
    }
}
