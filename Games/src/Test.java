public class Test {
    public static void main(String[] args) {
        double[] array = {2,2,0};
        double percentageRock = 0;
        double percentagePaper = 0;
        double percentageScissors = 0;
        double total = (array[0] + array[1] + array[2]);
        System.out.println(total);
        System.out.println(array[0]+" " + array[1]+" " + array[2]);
        if(array[0] != 0) {
            percentageRock = array[0]/total*100;
            int intPercentageRock = (int) percentageRock;
            System.out.println("Rock"+intPercentageRock);
        }
        if(array[1] != 0) {
            percentagePaper = array[1]/total*100;
            int intPercentagePaper = (int) percentagePaper;
            System.out.println("Rock"+intPercentagePaper);
        }
        if(array[2] != 0) {
            percentageScissors = array[2]/total*100;
            int intPercentageScissors = (int) percentageScissors;
            System.out.println("Rock"+intPercentageScissors);
        }
    }
}
