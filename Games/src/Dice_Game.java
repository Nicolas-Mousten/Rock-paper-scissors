import java.util.Random;
import java.util.Scanner;

public class Dice_Game {
    public static boolean variabel2;
    public static String variabelString2;
    public static void main(String[] args) {
        variabelString2 = "";
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int winCounter = 0;
        int loseCounter = 0;
        System.out.println("Are you a teacher? Write yes if true");
        String easyChoice = scanner.nextLine();
        String activate = "yes";
        if(easyChoice.equalsIgnoreCase(activate)){
            variabel2 = random.nextBoolean();
            variabelString2 = String.valueOf(variabel2);
            System.out.println("Activating Easy Mode!");
        }
        for (int i = 0; i < 10; i++) {
            Boolean variabel = random.nextBoolean();

            System.out.println("The dice have been casted. Guess even or odd");

            String guess = scanner.nextLine();

            boolean newGuess = guess.equalsIgnoreCase("odd") ? true : false;

            String variabelString = String.valueOf(variabel);
            String newGuessString = String.valueOf(newGuess);

            if (variabel == true || variabel2 == true) {
                System.out.println("A dice is odd");
            } else {
                System.out.println("A dice is even");
            }
            if (variabelString.equalsIgnoreCase(newGuessString)||variabelString2.equalsIgnoreCase(newGuessString)) {
                System.out.println("You guessed correct");
                winCounter = winCounter+1;
            }
            else if(variabelString != newGuessString ||variabelString2 != newGuessString){
                System.out.println("You guessed incorrect");
                loseCounter = loseCounter+1;
            }
            System.out.println("You have guessed correct "+winCounter+" times and incorrect "+loseCounter+" times in total\n");
        }
    }
}
