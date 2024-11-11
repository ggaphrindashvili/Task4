import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(50) + 1;
     //   System.out.println(randomNumber);

        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 50. Try to guess it!");

        while (userGuess != randomNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < randomNumber) {
                System.out.println("Too low, try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high, try again.");
            } else {

                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
            }
        }

        scanner.close();
    }
}