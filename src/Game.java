import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        System.out.println("Hi. What's your name?");
        Scanner username= new Scanner(System.in);
        String name= username.nextLine();
        System.out.println("Let's play, " + name + "!");
        double x = Math.random();
        int num = (int) (x*11);
        Scanner input = new Scanner(System.in);
        int guess = 0;
        int guessTracker=0;
        System.out.println("I'm thinking of a number from 0 to 10. Can you guess?");
        guess = input.nextInt();
        while (guess!=num){
            System.out.println("Sorry, " + name +"! Guess again!");
            guess = input.nextInt();
            guessTracker+=1;
        }
        System.out.println("You guessed correct, " + name + "!");
        System.out.println("Number of tries: " + (guessTracker+1));
    }
}
