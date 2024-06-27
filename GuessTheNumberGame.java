/**
 * GUESS THE NUMBER GAME USING OOPS
 */

import java.util.Random;
import java.util.Scanner;

class Game{
    int rand;
    int noOfGuess = 0;
    Game(){
        Random obj = new Random();
        rand = obj.nextInt(100);
        takeUserInput();
    }

    void takeUserInput(){
        System.out.println("Enter your guess : ");
        Scanner obj2 = new Scanner(System.in);
        int guess = obj2.nextInt();
        isCorrectNumber(guess);
    }

    void isCorrectNumber(int guess){
        if(guess == rand ){
            System.out.println("Congrats ! Correct Guess");
            noOfGuess++;
            getNoOfGuess();
        }
        else if(guess < rand){
            System.out.println("Your guess is smaller , choose larger value");
            noOfGuess++;
            takeUserInput();
        }
        else if(guess > rand){
            System.out.println("Your guess is greater , choose smaller value");
            noOfGuess++;
            takeUserInput();
        }
    }

    void getNoOfGuess(){
        System.out.println("Your Score : "+noOfGuess);
    }
}

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Game sc = new Game();
    }
}
