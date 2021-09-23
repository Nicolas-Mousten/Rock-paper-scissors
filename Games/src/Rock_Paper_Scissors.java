import java.util.Random;
import java.util.Scanner;


public class Rock_Paper_Scissors {
    public static int player1Wins;
    public static int Plyaer2_PcWins;
    public static int numberOfRounds;
    
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
            Plyaer2_PcWins = Plyaer2_PcWins +1;
        }
        else if(result == 1 || result ==-2){
            output = "Win";
            player1Wins = player1Wins +1;
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
    public static String translatePC(int input,int[] percentageArray){
        //input can be between 1 and 100.
        int rockPercentage = percentageArray[0];
        int paperPercentage = percentageArray[1];
        int scissorsPercentage = percentageArray[2];
        String translatedString = "";



        if(input >= paperPercentage){                        //hvis scissors bliver valgt meget ska compiuter ha mere chanve for at vælge paper derfor ska input være større æn array[2]
            translatedString = "Rock";
        }
        if(input <= paperPercentage){                        //hvis rock bliver valgt meget ska compiuter ha mere chance for at vælge paper derfor ska input være mindre æn array[0]
            translatedString = "Paper";
        }
        if(input< rockPercentage && input > paperPercentage){//hvis paper bliver valgt meget ska compiuter ha mere chance for at vælge scissors derfor ska input være mere æn array[1]
            translatedString = "Scissors";
        }
        return translatedString;
    }
    
    
    
    public static void vsPC(){
        scanner();
        int[] sequenceArray = new int[numberOfRounds];
        int[] playerMovesArray = {0,0,0};
        int counter = 0;
        for (int i = 0; i < numberOfRounds; i++) {
            int intPC;
            counter = counter +1;
            System.out.println("Rock, Paper, Scissors");
            String player1 = scanner().nextLine();
            System.out.println("Player 1: " + player1);
            int pc = randomizer(100, 1);
            //System.out.println("pc: " + pc);
            int intPlayer1 = translateToInt(player1);


            playerMovesArray = playerMoves(playerMovesArray, intPlayer1);


            sequenceArray = addOneEleArray(sequenceArray, intPlayer1,counter);

            int[] percentageArray = pcChoicePercentage(playerMovesArray);
            String strPC = translatePC(pc, percentageArray);
            intPC = translateToInt(strPC);

            if(counter <= 3){                       //Set a timer before smart AI is active
                intPC = randomizer(3,1);
            }
            if(counter >= 3){
                for (int j = 0; j < sequenceArray.length; j++) {
                    System.out.println(sequenceArray[i]);
                }
                System.out.println(sequenceArray[counter-1]+"["+(counter-1)+"]"+sequenceArray[counter-2]+"["+(counter-2)+"]");
                if(sequenceArray[counter-1] == sequenceArray[counter-2] ){
                    if(intPlayer1 == 1){
                        intPC = 2;
                        strPC = "Paper";
                    }else if(intPlayer1 == 2){
                        intPC = 3;
                        strPC = "Scissors";
                    }else if(intPlayer1 == 3){
                        intPC = 1;
                        strPC = "Rock";
                    }}}
            System.out.println("Pc: " +strPC);
            System.out.println("PC:"+intPC+"PL:"+intPlayer1);
            String stats = gameLogic(intPlayer1, intPC);            //Engine behind the game
            System.out.println("Player 1 " + stats);
            System.out.println("\nNr of wins:\nPlayer1: "+player1Wins+"\nPC: "+Plyaer2_PcWins);
        }
    }
    public static int[] addOneEleArray(int[] oldArray, int playerMove,int counter){
        int[] newArray = new int[oldArray.length];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[counter-1] = playerMove;

        return newArray;
    }
    public static int[] playerMoves(int[] oldArray, int newMove){
        newMove = newMove-1;
        int[] playermovesArray = new int[oldArray.length];
        for (int i = 0; i < playermovesArray.length; i++) {
            if(i != playermovesArray.length){
                playermovesArray[i] = oldArray[i];
                if(i == newMove){
                    playermovesArray[i] = playermovesArray[i]+1;
                }
            }
        }
        return playermovesArray;
    }
    public static int[] pcChoicePercentage(int[] array){
        //Returns the array with percentage info to each element instead.
        double percentageRock = 0;
        double percentagePaper = 0;
        double percentageScissors = 0;
        int intPercentageRock = 0;
        int intPercentagePaper = 0;
        int intPercentageScissors = 0;
        int total = (array[0] + array[1] + array[2]);
        if(array[0] != 0) {
            percentageRock =(double) array[0]/total*100;
            intPercentageRock = (int) percentageRock;
        }
        if(array[1] != 0) {
            percentagePaper =(double) array[1]/total*100;
            intPercentagePaper = (int) percentagePaper;
        }
        if(array[2] != 0) {
            percentageScissors =(double) array[2]/total*100;
            intPercentageScissors = (int) percentageScissors;
        }
        int[] newArray = {intPercentageRock,intPercentagePaper,intPercentageScissors};
        return newArray;
    }



    public static void pvp(){

        for (int i = 0; i < numberOfRounds; i++) {
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
        String gameMode = scanner().nextLine();
        System.out.println("How many rounds?");
        numberOfRounds = scanner().nextInt();
        if(gameMode.equalsIgnoreCase("pvp")){
            pvp();
        }
        else if(gameMode.equalsIgnoreCase("pva")){
            vsPC();
        }
    }
}
