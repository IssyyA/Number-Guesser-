
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int randomNumber = (int)(Math.random() * 100 + 1);
        boolean hasWon = false;
        System.out.println("I have randomly chosen a number between 1 & 100 ");
        System.out.println("Try to guess that number");

        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i > 0; i--){
            System.out.println("You have " +  i  + " guesses left : Guess again");
            int guess = scanner.nextInt();
            if(randomNumber < guess){
                System.out.println("It is smaller than " + guess + ".");
            }else if(randomNumber > guess){
                System.out.println(" It is greater than " + guess + ".");
            }else {
                hasWon = true;
                break;
            }
        }
        if(hasWon){
            System.out.println("CORRECT .... YOU WIN");
        }else{
            System.out.println("GAME OVER ...YOU LOSE");
            System.out.println("The number was : " + randomNumber );
        }
    }
}
