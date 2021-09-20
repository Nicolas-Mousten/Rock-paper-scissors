import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static int player1Wins;
    public static int Plyaer2_PcWins;

    public static Scanner scanner(){
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }
    public static String gameLogic(int player1,int player2){
        int result = player1-player2;
        String output = "";
        if (result == 0){
            output = "Draw";
        }
        else if(result == -1 || result == 2){
            output = "Lose";
        }
        else if(result == 1 || result ==-2){
            output = "Win";
        }
        return output;
    }
    public static int randomizer(int max, int min){
        Random random = new Random();
        max = max+1;
        int rand = random.nextInt(max-min)+min;
        return rand;
    }
    public static int easyScannerDouble(){
        scanner();
        String input = scanner().nextLine();
        input = input.replace(",", ".");
        int output = Integer.parseInt(input);
        return output;

    }
    public static int translateToInt(String input){
        int translatedInt = 0;
        if(input.equalsIgnoreCase("Rock")){
            translatedInt = 1;
        }
        if(input.equalsIgnoreCase("Paper")){
            translatedInt = 2;
        }
        if(input.equalsIgnoreCase("Scissors")){
            translatedInt = 3;
        }
        return translatedInt;
    }
    public static String translatePC(int input){
        String translatedString = "";
        if(input==1){
            translatedString = "Rock";
        }
        if(input==2){
            translatedString = "Paper";
        }
        if(input==3){
            translatedString = "Scissors";
        }
        return translatedString;
    }
    public static void vsPC(){
        scanner();
        while(true) {
            System.out.println("Rock, Paper, Scissors");
            String player1 = scanner().nextLine();
            System.out.println("Player 1: " + player1);
            int pc = randomizer(3, 1);
            int intPlayer1 = translateToInt(player1);
            String strPC = translatePC(pc);
            System.out.println("Pc: " +strPC);
            String stats = gameLogic(intPlayer1, pc);
            System.out.println("Player 1 " + stats);
        }
    }
    public static void pvp(){

        while(true) {
            System.out.println("Rock, Paper, Scissors");
            String player1 = scanner().nextLine();
            System.out.println("\n\n\n\n\n\n\n\nRock, Paper, Scissors");
            String player2 = scanner().nextLine();
            System.out.println("\n\n\n");
            System.out.println("Player 1 choose: "+player1);
            System.out.println("Player 2 choose: "+player2);
            int intPlayer1 = translateToInt(player1);
            int intPlayer2 = translateToInt(player2);
            String stats = gameLogic(intPlayer1, intPlayer2);
            if(stats =="Win"){
                System.out.println("Player 1 Won");
            }else if(stats =="Lose"){
                System.out.println("Player 2 Won");
            }else{
                System.out.println(stats);
        }}
    }
    public static void main(String[] args) {
        System.out.println("Gamemode? pvp/pva");
        scanner();
        String gameMode = scanner().nextLine();
        if(gameMode.equalsIgnoreCase("pvp")){
            pvp();
        }
        else if(gameMode.equalsIgnoreCase("pva")){
            vsPC();
        }
    }
}
