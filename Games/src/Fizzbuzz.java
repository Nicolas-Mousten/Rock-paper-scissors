public class Fizzbuzz {
    public static void main(String[] args) {
        int x =0;
        while(x<100){
            x = x+1;
            if(x%3==0 && x%5 ==0){
                System.out.println("FizzBuzz");
            }
            else if(x%3 ==0){
                System.out.println("Fizz");
            }
            else if(x%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(x);
            }
        }
    }
}
