import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random randomnum = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a number between 1 and 100.");
        String userInput = scanner.nextLine();
        Integer convertedInput = Integer.parseInt(userInput);
        int randomNumber = randomnum.nextInt(1, 101);
        System.out.println("randomNumber = " + randomNumber);
        int i = 0;
        while (i < 4) {
            if (convertedInput == randomNumber) {
                System.out.println("You win Great job!!");
                break;
            } else if (convertedInput < 1 || convertedInput > 100) {
                convertedInput = Inputcollector.collectGuess(scanner, convertedInput,
                        "Invalid guess, no chances used try again: ");
                i--;
            } else if (convertedInput > randomNumber) {
                convertedInput = Inputcollector.collectGuess(scanner, convertedInput,
                        convertedInput + " is to high try lower!");
                i++;
            } else if (convertedInput < randomNumber) {
                convertedInput = Inputcollector.collectGuess(scanner, convertedInput,
                        convertedInput + " is to low try higher");
                i++;
            }
            } if (i == 4){
                System.out.println("You lose! Winning number was: " + randomNumber);
            }

        }
    }
