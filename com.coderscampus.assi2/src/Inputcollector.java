import java.util.Scanner;
public class Inputcollector {
    public static Integer collectGuess(Scanner scanner, Integer convertedInput, String gamemessage){
        String userInput;
        System.out.println(gamemessage);
        userInput = scanner.nextLine();
        convertedInput = Integer.parseInt(userInput);
        return convertedInput;
    }
}
