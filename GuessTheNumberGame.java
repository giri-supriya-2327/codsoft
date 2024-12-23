import java.util.Scanner;
import java.util.Random;

public class GuessTheNumberGame {
    private static final int MAX_ATTEMPTS = 10;

    public static void playGame() {
        Random randomGenerator = new Random();
        int lowerBound = 1, upperBound = 100;
        int randomNumber = randomGenerator.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int playerGuess, numberOfTries = 0;

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Welcome to Guess the Number!");
        System.out.println("Try to guess the number between " + lowerBound + " and " + upperBound + ".");

        while (numberOfTries < MAX_ATTEMPTS) {
            System.out.print("Your guess: ");
            playerGuess = inputScanner.nextInt();
            numberOfTries++;

            if (playerGuess < randomNumber) {
                System.out.println("Too low!");
            } else if (playerGuess > randomNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You've guessed the number correctly.");
                break;
            }

            if (numberOfTries == MAX_ATTEMPTS) {
                System.out.println("Sorry, you've used all your attempts. The number was " + randomNumber + ".");
            }
        }
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int replayOption;

        do {
            playGame();

            System.out.print("Would you like to play again? (1 for Yes, 0 for No): ");
            replayOption = inputScanner.nextInt();
        } while (replayOption == 1);

        System.out.println("Thanks for playing!");
    }
}