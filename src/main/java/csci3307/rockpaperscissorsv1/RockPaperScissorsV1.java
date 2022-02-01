/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci3307.rockpaperscissorsv1;

import java.util.Scanner;

/**
 *
 * @author Lee
 * 
 * Play a simple game of rock, paper scissors
 */
public class RockPaperScissorsV1 {
    static final String RPS_INTRO_MESSAGE = "\tWelcome to Rock, Paper, Scissors\n"
            + "Each round, player inputs 0 (Rock), 1 (Paper) or 2 (Scissors),\n"
            + "Computer will randomly select it's choice\n"
            + "and the round result will be displayed.\n"
            + "The game continues until you close the program\n";
    
    static final String PLAYER_PROMPT = "\nPlease enter choice (0,1,2)\n";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(RPS_INTRO_MESSAGE);
        
                // Initialize Scanner for Getting Input from User
        Scanner playerInput = new Scanner(System.in);
 
                // Print prompt - get player choice
        System.out.println(PLAYER_PROMPT);
        int playerChoice = playerInput.nextInt();
        while (true) {
            switch (playerChoice) {
                case 0:
                    System.out.println("You picked ROCK");
                    break;
                case 1:
                    System.out.println("You picked PAPER");
                    break;
                case 2:
                    System.out.println("You picked SCISSORS");
                    break;
                default:
                    System.out.println("INVALID CHOICE:" + PLAYER_PROMPT);
            }
            playerChoice = playerInput.nextInt();         
        }

    }
    
}
