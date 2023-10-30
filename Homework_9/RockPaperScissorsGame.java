package Homework_9;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rock-Paper-Scissors Game");
        System.out.println("Choose an option: ROCK, SCISSORS or PAPER");

        String playerChoiceStr = scanner.nextLine().toUpperCase();
        try {
            Choice playerChoice = Choice.valueOf(playerChoiceStr);
            Choice computerChoice = getRandomChoice();
            System.out.println("The computer chose: " + computerChoice);

            if (playerChoice == computerChoice) {
                System.out.println("A draw!");
            } else if (playerChoice.getGameItem().beats(computerChoice.getGameItem())) {
                System.out.println("You won!");
            } else {
                System.out.println("The computer won!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Sorry, wrong choice. Choose ROCK, SCISSORS or PAPER.");
        }
    }

    private static Choice getRandomChoice() {
        Choice[] choices = Choice.values();
        Random random = new Random();
        return choices[random.nextInt(choices.length)];
    }
}
