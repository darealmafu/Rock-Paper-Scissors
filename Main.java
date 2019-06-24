package zone.mafu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bestOf = 0;

        while(!(bestOf > 0)) {
            System.out.println("What number would you like the game to be out of?");
            bestOf = sc.nextInt();
        }

        String[] options = {"rock", "paper", "scissors"};
        String userGuess;
        String botGuess;

        int userScore = 0;
        int botScore = 0;

        for(int i = 0; i < bestOf; i++){
            System.out.println("Input your choice");
            userGuess = sc.next();
            botGuess = options[(int)(Math.random() * 3)];
            System.out.println("bot's guess is " + botGuess);
            if(userGuess.equalsIgnoreCase(botGuess)){
                System.out.println("Draw!");
                i--;
            } else if(userGuess.equalsIgnoreCase("rock")){
                if(botGuess.equals("paper")){
                    System.out.println("Point for the bot!");
                    botScore++;
                } else {
                    System.out.println("Point for you!");
                    userScore++;
                }
            } else if (userGuess.equalsIgnoreCase("paper")){
                if(botGuess.equals("scissors")){
                    System.out.println("Point for the bot.");
                    botScore++;
                } else {
                    System.out.println("Point for you!");
                    userScore++;
                }
            } else if (userGuess.equalsIgnoreCase("scissors")){
                if(botGuess.equals("rock")){
                    System.out.println("Point for the bot.");
                    botScore++;
                } else {
                    System.out.println("Point for you!");
                    userScore++;
                }
            } else {
                System.out.println("The bot is confused by your invalid user input.");
                i--;
            }
            System.out.println();
        }

        System.out.println("Bot's score: " + botScore);
        System.out.println("Your score: " + userScore);

        if(userScore > botScore){
            System.out.println("You win!");
        } else {
            System.out.println("You lose :(");
        }
    }
}
