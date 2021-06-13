import java.util.ArrayList;
public class TestBasicJava{
    public static void main(String[] args){
        
        BasicJava printer = new BasicJava();
        printer.printAll(255);

        BasicJava oddprinter = new BasicJava();
        oddprinter.printOdd(255);

        BasicJava sumprinter = new BasicJava();
        sumprinter.printSum(255);

        BasicJava iterator = new BasicJava();
        iterator.iterateArray(new int[] {1,3,5,7,9,13});

        BasicJava max = new BasicJava();
        max.findMax(new int[] {-2,0,-4,-5,-4,13});

        BasicJava average = new BasicJava();
        average.findAverage(new float[] {0,1,2,3,4,5});

        BasicJava builder = new BasicJava();
        ArrayList<Integer> arrlist = new ArrayList<Integer>(0);
        builder.buildArray(arrlist, 255);

        BasicJava greater = new BasicJava();
        greater.greaterThanY(new int[] {1,3,5,7}, 3);

        BasicJava square = new BasicJava();
        square.squaredArray(new int[] {1,5,10,-2});

        BasicJava eliminate = new BasicJava();
        eliminate.eliminateNegatives(new int[] {2,3,-5,-2,-8,8});

        BasicJava maximize = new BasicJava();
        maximize.maxMinAverage(new int[] {1,5,10,-2});

        BasicJava shifter = new BasicJava();
        shifter.shiftingValues(new int[] {1,5,10,7,-2});
    }
}