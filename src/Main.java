import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Guess the number!");
        Random rand = new Random();

        int counter = 0;
        int guess = rand.nextInt(100);
        guess += 1;

        int playersguess = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("\nPlease enter your name: ");
        String playersname = input.nextLine();
        System.out.println("\nDear " + playersname + " have fun playing this game!");


        do {
            System.out.println("\nEnter your guess: ");
            playersguess = input.nextInt();
            counter ++;

            if (playersguess <= 0 || playersguess > 100) {
                System.out.println("Invalid guess.");
                System.out.println("Your guess must be between 1 and 100!");

                counter = counter -1;
            }
            if (playersguess < guess & playersguess > 0) {
                System.out.println("Your guess is too small");
            } else if (playersguess > guess & playersguess < 101)
                System.out.println("Your guess is too big!");
        }
        while (playersguess != guess);
        System.out.println("\nWell done " + playersname + "! You guessed the secret number! Bravo!");
        System.out.println("\nYou needed " + counter + " guesses.");
    }
}