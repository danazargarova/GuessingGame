import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        double x = Math.random();
        int num = (int) (x*11);
        Scanner input = new Scanner(System.in);
        int guess = 0;
        System.out.println("I'm thinking of a number from 0 to 10. Can you guess?");
        guess = input.nextInt();
        while (guess!=num){
            System.out.println("Sorry! Guess again!");
            guess = input.nextInt();
        }
        System.out.println("You guessed correct!");
    }
}
