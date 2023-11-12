package Homework_9;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RockPaperScissorsGame {
    private static final Logger LOGGER = Logger.getLogger(RockPaperScissorsGame.class.getName());

    public static void main(String[] args) {
        // Set the logging level (you can adjust as needed)
        LOGGER.setLevel(Level.INFO);

        Scanner scanner = new Scanner(System.in);
        LOGGER.info("Rock-Paper-Scissors Game");
        LOGGER.info("Choose an option: ROCK, SCISSORS, or PAPER");

        String playerChoiceStr = scanner.nextLine().toUpperCase();
        try {
            Choice playerChoice = Choice.valueOf(playerChoiceStr);
            Choice computerChoice = getRandomChoice();
            LOGGER.info("The computer chose: " + computerChoice);

            if (playerChoice == computerChoice) {
                LOGGER.info("A draw!");
            } else if (playerChoice.getGameItem().beats(computerChoice.getGameItem())) {
                LOGGER.info("You won!");
            } else {
                LOGGER.info("The computer won!");
            }
        } catch (IllegalArgumentException e) {
            LOGGER.log(Level.WARNING, "Invalid choice entered. Choose ROCK, SCISSORS, or PAPER.", e);
        }
    }

    private static Choice getRandomChoice() {
        Choice[] choices = Choice.values();
        Random random = new Random();
        return choices[random.nextInt(choices.length)];
    }
}
