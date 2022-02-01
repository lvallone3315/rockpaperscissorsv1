/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci3307.rockpaperscissorsv1;

import java.util.Random;
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
 
                // Print prompt - get player choice from console
        System.out.println(PLAYER_PROMPT);
        int playerChoice = playerInput.nextInt();
        
            // Generate random number in range 0..2
        Random r = new Random();
        int computerChoice = r.nextInt(3);
                
        
        /*
         * Approach - 3 player choices - 3 computer choices - so 9 cases
         *   Exhaustive implemententation
         *      switch on player choice, for each choice, switch on comp choice
         * ToDo - this doesn't scale well & is hard to read even with 3 choices
        */
        while (true) {
            switch (playerChoice) {
                case 0:  // player chose Rock
                    System.out.println("You picked ROCK");
                    switch (computerChoice) {
                        case 0:
                            System.out.println("You both picked Rock.  It's a tie!");
                            break;
                        case 1:
                            System.out.println("Paper covers rock.  Computer wins!");
                            break;
                        case 2:
                            System.out.println("Rock dulls scissors.  You win!");
                            break;
                        default:  // null default - included for readability, should never get here
                    }
                    break;  // end Rock
                case 1:     // player chose Paper
                    System.out.println("You picked PAPER");
                    switch (computerChoice) {
                        case 0:
                            System.out.println("Paper covers rock.  You win!");
                            break;
                        case 1:
                            System.out.println("You both picked paper.  It's a tie!");
                            break;
                        case 2:
                            System.out.println("Scissors cut paper.  Computer wins!");
                            break;
                        default:  // null default - included for readability, should never get here
                    }
                    break;  // end Paper
                case 2:     // player chose Scissors
                    System.out.println("You picked SCISSORS");
                    switch (computerChoice) {
                        case 0:
                            System.out.println("Rock dulls scissors.  Computer wins!");
                            break;
                        case 1:
                            System.out.println("Scissors cut paper.  You win!");
                            break;
                        case 2:
                            System.out.println("You both picked scissors.  It's a tie!");
                            break;
                        default:  // null default - included for readability, should never get here
                    }
                    break; // end Scissors
                default:
                    System.out.println("INVALID CHOICE:" + PLAYER_PROMPT);
            }
            
            // get input for next round
            // ToDo - add a case for quitting based on user input
            playerChoice = playerInput.nextInt();
            computerChoice = r.nextInt(3);
        }
    }
}
