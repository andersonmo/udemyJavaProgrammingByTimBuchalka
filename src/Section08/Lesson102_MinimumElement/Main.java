package Section08.Lesson102_MinimumElement;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many integers to be entered?\r");
        int count = sc.nextInt();
        int[] theArray = readIntegers(count);

        System.out.println("theArray: "+ Arrays.toString(theArray));
        System.out.println("------------------------------------------");

        int min = findMin(theArray);
        System.out.println("Minimum value in theArray: "+min);

        sc.close();
    }

    public static int[] readIntegers(int count){
        System.out.println("Enter "+count+" integers.");
        int[] array = new int[count];
        for (int i=0; i<count; i++){
            array[i]=sc.nextInt();
        }
        return array;
    }

    public static int findMin(int[] arrayParameter){
        int minimumValue = arrayParameter[0];
        for (int i=1; i<arrayParameter.length; i++){
            if(arrayParameter[i] < minimumValue){
                minimumValue = arrayParameter[i];
            }
        }
        return minimumValue;
    }

}
