import java.util.ArrayList;
import java.lang.Math;
public class BasicJava{
    
    // Print all numbers between 1-255
    public void printAll(int num){
        for(int i = 1; i<=num; i++){
            System.out.println(i);
        }
    }

    // Print all odd numbers between 1-255
    public void printOdd(int num){
        for(int i = 1; i<=num; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    // Print sum of previous numbers in sequence of 1-255
    public void printSum(int num){
        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum += i;
            System.out.println("New Number: " + i + " " + "Sum: " + sum);
        }
    }

    // Iterate through an array
    public void iterateArray(int[] array){
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]); //Expected output 1,3,5,6,9,13
        }
    }

    // Find maximum value within array
    public void findMax(int[] array){
        int max = array[0];
        for(int i = 0; i<array.length; i++){
            if(array[i]>max){
                max = array[i];
            }
        }System.out.println(max);
    }

    // Find exact average of numbers within array
    public void findAverage(float[] array){
        float average = 0;
        for(int i = 0; i<array.length;i++){
            average += array[i];
        }System.out.println(average/array.length);
    }

    // Build an array of only the odd numbers from a given input
    public void buildArray(ArrayList<Integer> y, int num){
        for(int i = 0; i<=num; i++){
            if(i%2 != 0){
                y.add(i);
            }
        }System.out.println(y);
    }
    // Iterates an array and displays the number of values greater than y
    public void greaterThanY(int[] array, int y){
        int count = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i] > y){
                count+=1;
            }
        }System.out.println(count);
    }
    
    // Iterates an array and squares each invdividual value
    public void squaredArray(int[] array){
        ArrayList<Integer> x = new ArrayList<Integer>();
        for(int i = 0; i<array.length; i++){
            x.add((int) Math.pow(array[i],2));
        }System.out.println(x);
    }
    
    // Iterates an array and converts all negative numbers to 0
    public void eliminateNegatives(int[] array){
        ArrayList<Integer> x = new ArrayList<Integer>();
        for(int i = 0; i<array.length; i++){
            if(array[i] < 0){
                x.add(0);
            }else{
                x.add(array[i]);
            } 
        }System.out.println(x);
    }

    // Iterates an array and displays the lowest number, highest number, and the average of all numbers in array
    public void maxMinAverage(int[] array){
        ArrayList<Integer> x = new ArrayList<Integer>();
        int min = 0;
        int max = 0;
        int average = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i]<array[0]){
                min = array[i]; 
            }else if(array[i]>array[0]){
                max = array[i];
            }
            average += array[i];
        } x.add(min);
        x.add(max);
        x.add(average/array.length);
        System.out.println(x);
    }

    // Shifts all the values within an array one index to the left
    public void shiftingValues(int[] array){
        ArrayList<Integer> x = new ArrayList<Integer>();
        int index = 0;
        for (int i = 1; i<array.length; i++){
            index = array[i];
            if(i < array.length){
                x.add(index);
            }if(i+1 >= array.length){
                x.add(0);
            }
        }System.out.println(x);
    }
}