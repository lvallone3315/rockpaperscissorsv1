/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci3307.rockpaperscissorsv1;

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
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(RPS_INTRO_MESSAGE);
        
    }
    
}
