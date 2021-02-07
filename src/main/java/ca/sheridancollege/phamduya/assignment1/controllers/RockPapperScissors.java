package ca.sheridancollege.phamduya.assignment1.controllers;

import org.springframework.stereotype.Controller;

import java.io.Serializable;

@Controller
public class RockPapperScissors implements Serializable {
    private String[] computerList = {"ROCK", "PAPPER", "SCISSORS"};
    private int userChoice;
    private int compRand;

    public void gameResult(){
        compRand = (int)(4 * Math.random());
        if(userChoice == compRand){
            System.out.println("DRAW");
            System.out.println("YOU: " + " - Computer: " + computerList[compRand]);
        }//u: rock - c: papper
        else if(userChoice == 0 && compRand == 1){
            System.out.println("LOSE");
            System.out.println("YOU: " + " - Computer: " + computerList[compRand]);
        }//u: rock - c: scissors
        else if(userChoice == 0 && compRand == 2){
            System.out.println("WIN");
            System.out.println("YOU: " + " - Computer: " + computerList[compRand]);
        }//u: papper - c: rock
        else if(userChoice == 1 && compRand == 0){
            System.out.println("WIN");
            System.out.println("YOU: " + " - Computer: " + computerList[compRand]);
        }//u: papper - c: scissors
        else if(userChoice == 1 && compRand == 2){
            System.out.println("LOSE");
            System.out.println("YOU: " + " - Computer: " + computerList[compRand]);
        }//u: scissors - c: rock
        else if(userChoice == 2 && compRand == 0){
            System.out.println("LOSE");
            System.out.println("YOU: " + " - Computer: " + computerList[compRand]);
        }//u: scissors - c: papper
        else if(userChoice == 2 && compRand == 1){
            System.out.println("WIN");
            System.out.println("YOU: " + " - Computer: " + computerList[compRand]);
        }
    }
}
