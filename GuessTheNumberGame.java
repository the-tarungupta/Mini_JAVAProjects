import java.util.Random;
import java.util.Scanner;

class Game {
    int compInput;
    int userInput;
    int noOfGuess = 1;
    public void mainMenu() {
        System.out.println("=================== X Guess The Number Game X ===================");
        System.out.println();
        System.out.print("Enter the range value : ");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        System.out.println("Value Range : 0 to " + (range - 1));

        Random rand = new Random();
        compInput = rand.nextInt(range);

        userGuess();

    }

    public void userGuess(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your guess : ");
        userInput = sc.nextInt();

        if(userInput == compInput ){
            System.out.println("Correct Guess ! You won ");
            if(noOfGuess <=3) {
                System.out.println("No. of guess taken : " + noOfGuess);
                System.out.println("You won");
            }
        }
        else if(userInput < compInput){
            System.out.println("Your Guess value is smaller ! Guess Larger value");
            noOfGuess++;
            if(noOfGuess <=3) {
                userGuess();
            }
            else{
                System.out.println("\nYou lose ! Your chances get finished ");
                System.out.println("No. of guess taken : " + noOfGuess);
            }
        }
        else if(userInput > compInput){
            System.out.println("Your Guess value is larger ! Guess Smaller value");
            noOfGuess++;
            if(noOfGuess <=3) {
                userGuess();
            }
            else{
                System.out.println("\nYou lose ! Your chances get finished ");
                System.out.println("No. of guess taken : " + noOfGuess);
            }
        }

    }
}
public class GuessTheNumberGame {
    public static void main(String[] args) {
        Game obj = new Game();
        obj.mainMenu();

    }
}
