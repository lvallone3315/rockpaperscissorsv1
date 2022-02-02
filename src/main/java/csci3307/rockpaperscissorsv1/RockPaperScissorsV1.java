package csci3307.rockpaperscissorsv1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lee
 * 
 * Play a simple game of rock, paper scissors
 * 
 * Refactored version using helper functions making code more readable &
 * easier to change.
 * 
 * Helper functions and Intro message know the choices - ie main loop doesn't care
 * Still hardcoding # of choices in main
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
 
  
        int playerChoice;
        
            // Generate random number in range 0..2
        Random r = new Random();
        int computerChoice;
                
        
        /*
         * Refactored using helper functions
        */
        while (true) {
                // Get player choice from console & validate
            System.out.println(PLAYER_PROMPT);
            playerChoice = playerInput.nextInt();
            if ((playerChoice < 0) || (playerChoice > 2)) {
                System.out.println("Invalid Input - please select 0, 1 or 2");
                continue;
            }
            System.out.println("You picked " + helperFunctions.getRPS_String(playerChoice));
            
                // Get Computer Choice - nextInt => 0 <= # < 3
            computerChoice = r.nextInt(3);
            System.out.println("Computer picked " + helperFunctions.getRPS_String(computerChoice));
            
                // Score round
            if (helperFunctions.playerWon(playerChoice, computerChoice))
                    System.out.println("Player Won!");
            else if (helperFunctions.playerTied (playerChoice, computerChoice))
                System.out.println("It's a Tie!");
            else
                System.out.println("Computer Won!");
        }  // end game loop
    }  // end main
}

class helperFunctions {    
    public static boolean playerWon (int playerMove, int computerMove) {
        switch (playerMove) {
            case 0:  // if player chose Rock
                if (computerMove == 2)  // and computer chose scissors
                    return true;
                else
                    return false;
            case 1:     // if player chose Paper
                if (computerMove == 0)  // and computer chose rock
                    return true;
                else
                    return false;
            case 2:     // if player chose Scissors
                if (computerMove == 1)  // and computer chose paper
                    return true;
                else
                    return false;
            default:
                // included for readability, should never get here
                return false;
        }
    }
    
    public static boolean playerTied(int playerMove, int computerMove) {
        if (playerMove == computerMove)
            return true;
        else
            return false;
    }
    
    public static String getRPS_String(int move) {
        switch (move) {
            case 0:
                return ("Rock");
            case 1:
                return ("Paper");
            case 2:
                return ("Scissors");
            default:
                return ("Invalid Input");
        }
    }
}
