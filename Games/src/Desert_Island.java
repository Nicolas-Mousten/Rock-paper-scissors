import java.util.Scanner;

public class Desert_Island {
    public static int[] newArray;
    public static int getGreatest(int[]array,int len){
        int greatestElement;
        int[] temporaryArray = new int[len];


        for (int i = 0; i < array.length; i++) {
            temporaryArray[i] = newArray[i];
        }
        for (int i = 0; i < temporaryArray.length; i++) {
            if(temporaryArray[i]>temporaryArray[0]){
                temporaryArray[0] = temporaryArray[i];
            }
        }
        //get the index of the greatest number
        int greatestInt = temporaryArray[0];
        for (int i = 0; i < newArray.length; i++) {
            if(newArray[i] == temporaryArray[0]){
                //i is saved for later use

            }
        }

        greatestElement=1;
        return greatestElement;
    }
    public static int[] newArray(int[] oldArray, int x, int answer){
        //int[] newArray;
        //Creating the elements equal to the old array
        newArray = new int[x];
        //creating new array
        for (int i = 0; i < x; i++) {
            newArray[i] = oldArray [i];
        }
        //adding the info into new array
        for (int i = 0; i < x; i++) {
            if(i == answer){
                newArray [i] = newArray[i]+1;
            }
        }
        //Printing new array with changes
        for (int i = 0; i < x; i++) {
            System.out.print(newArray[i] + ",");
        }
        System.out.println("\n");
        return newArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Desert Island\nLet the game begin\n");
        int[] answerArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        String[] options = {"Lover","Coffee machine","Netflix","Couch","Running boots","Guitar","Candy","Dog","Book","Beer"};


        boolean lock = true;
        while(lock == true) {
            for (int i = 0; i < options.length; i++) {
                System.out.println(i + 1 + "-->" + options[i]);
            }
            System.out.print("Input Answer: ");
            int answer = scanner.nextInt() -1 ;
            scanner.nextLine();

            answerArray = newArray(answerArray, options.length, answer);
            int greatestElement;
            greatestElement = getGreatest(answerArray,answerArray.length);

            System.out.println("try again? else write = q");
            String quitLock = scanner.nextLine();
            if (quitLock.equalsIgnoreCase("q")){
                lock = false;
            }

        }
    }
}
