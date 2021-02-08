package ca.sheridancollege.phamduya.assignment1.model;


import lombok.Data;

import java.io.Serializable;

@Data
public class RockPapperScissors implements Serializable {
    private String[] computerList = {"ROCK", "PAPPER", "SCISSORS"};
    private int userChoice;
    private int compRand;


    public void setUserChoice(int userChoice){
        this.userChoice = userChoice;
    }

    public String gameResult(){
        compRand = (int)(4 * Math.random());
        if(userChoice == compRand){
            return "DRAW";
        }//u: rock - c: papper
        else if(userChoice == 0 && compRand == 1){
            return "WINNER: COMPUTER";
        }//u: rock - c: scissors
        else if(userChoice == 0 && compRand == 2){
            return "WINNER: USER";
        }//u: papper - c: rock
        else if(userChoice == 1 && compRand == 0){
            return "WINNER: USER";
        }//u: papper - c: scissors
        else if(userChoice == 1 && compRand == 2){
            return "WINNER: COMPUTER";
        }//u: scissors - c: rock
        else if(userChoice == 2 && compRand == 0){
            return "WINNER: COMPUTER";
        }//u: scissors - c: papper
        else if(userChoice == 2 && compRand == 1){
            return "WINNER: USER";
        }
        return "string";
    }
}
