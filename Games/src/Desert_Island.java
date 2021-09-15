import java.util.Scanner;

public class Desert_Island {

    public static int[] newArray(int[] oldArray, int x, int answer){
        int[] newArray;
        /*
        for (int i = 0; i < oldArray.length; i++) {
            System.out.print(oldArray[i] + ",");
        }
        System.out.println("\n");*/
        newArray = new int[x];
        //creating new array
        for (int i = 0; i < x; i++) {
            oldArray[i] = newArray[i];
        }
        //adding the info into new array
        for (int i = 0; i < x; i++) {
            if(i == answer){
                System.out.println(i);
                System.out.println(newArray[i]);
                newArray [i] = (newArray[i] +1);
            }
        }
        System.out.println(newArray[4]);
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
        for (int i = 0; i < options.length; i++) {
            System.out.println(i+1 + "-->" + options[i]);
        }
        boolean lock = true;
        while(lock == true) {
            System.out.print("Input Answer: ");
            int answer = scanner.nextInt() -1 ;
            scanner.nextLine();

            answerArray = newArray(answerArray, options.length, answer);


            System.out.println("try again? else write = q");
            String quitLock = scanner.nextLine();
            if (quitLock.equalsIgnoreCase("q")){
                lock = false;
            }
        }
    }
}
