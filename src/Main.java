/*
 * Joseph Homick
 * 6/19/19
 */
import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // Create a new random object and get a random number
        Random random = new Random();
        int from = 1;
        int to = 100;
        int randomNumber = random.nextInt(to - from + 1) + from;
        // Initialize the guessed number to 0
        int guessedNumber = 0;

        // Print the number
        System.out.printf("The number is between %d and %d.\n", from, to);

        // Get user input and see if the number guess is right!
        // If the answer is wrong, you'll get a hint and an attempt to try again
        do
        {
            System.out.print("Guess what the number is: ");
            guessedNumber = scan.nextInt();
            if (guessedNumber > randomNumber)
                System.out.println("Your guess is too high!");
            else if (guessedNumber < randomNumber)
                System.out.println("Your guess is too low!");
            else
                System.out.println("You got it!");
        } while (guessedNumber != randomNumber);
    }
}