import java.util.Scanner;
import java.util.stream.IntStream;
public class FizzBuzz{
    public static void main(String[] args){
        int num = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number:");
        num = scanner.nextInt();

        if((num % 5) == 0 && (num % 3) == 0){
            System.out.println("FizzBuzz");
        }else if((num % 5) == 0){
            System.out.println("Buzz");
        }else if((num % 3) == 0){
            System.out.println("Fizz");
        }
        else{
            System.out.println(num + " is not divisible by 3 or 5.");
        }
    }
}