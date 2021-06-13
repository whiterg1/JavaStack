import static java.lang.Math.sqrt;
import java.util.*;
public class Pythagorean{
    public static void main(String[] args) {
        double legA = 0;
        double legB = 0;
        double hypotenuse = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the length of Leg A? ");
        legA = scanner.nextDouble();

        System.out.print("What is the length of Leg B? ");
        legB = scanner.nextDouble();

        hypotenuse =  Math.sqrt((legA * legA) + (legB * legB));

        System.out.println("The hypotenuse of the triangle is " + hypotenuse);
    }
}
