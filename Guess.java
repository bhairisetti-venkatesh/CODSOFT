import java.util.*;

public class Guess {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int minRange = 1, maxRange = 100, maxAttempts = 3;
        boolean playAgain = true;
        
        while (playAgain) {
            Random r = new Random();
            int rNumber = r.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;

            System.out.println("Welcome to the guess game");
            System.out.println("Guess a number between " + minRange + " and " + maxRange);
            System.out.println("You have " + maxAttempts + " attempts to guess the number");

            while (attempts < maxAttempts) {
                System.out.println("Enter the number you guessed:");
                int number = s.nextInt();
                attempts++;

                if (number < rNumber) {
                    System.out.println("Too low! Try again");
                } else if (number > rNumber) {
                    System.out.println("Too high! Try again");
                } else {
                    System.out.println("Wow! You guessed correctly in " + attempts + " attempts");
                    break;
                }
            }

            int score = maxAttempts - attempts;

            if (attempts == maxAttempts) {
                System.out.println("You have completed your attempts");
                System.out.println("The correct number was " + rNumber);
                score = 0;
            }

            System.out.println("Your final Score: " + score + " out of " + maxAttempts);

            System.out.println("Do you want to continue? (y/n):");
            String choice = s.next().toLowerCase();

            playAgain = choice.equals("y");
        }

        System.out.println("Thanks for playing!!");
    }
}