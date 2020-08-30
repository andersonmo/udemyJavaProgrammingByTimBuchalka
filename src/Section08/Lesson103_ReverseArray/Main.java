package Section08.Lesson103_ReverseArray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] originalArray = {1, 5, 10, 15, 20};

        System.out.println("originalArray: "+ Arrays.toString(originalArray));
        System.out.println("--------------------------------");
        reverse(originalArray);

        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        int[] originalArray2 = {1, 5, 10, 15, 20, 25};

        System.out.println("originalArray: "+ Arrays.toString(originalArray2));
        System.out.println("--------------------------------");
        reverse(originalArray2);
    }

    private static void reverse (int[] array){

        int[] reverseArray = new int[array.length];
        int temp;
        int j = (array.length-1);

        for(int i=0; i<(array.length/2); i++){
            temp = array[i];
            reverseArray[i] = array[j];
            reverseArray[j] = temp;
            j--;
        }
        if (array.length%2 != 0) {
            reverseArray[(reverseArray.length / 2)] = array[(array.length / 2)];
        }
        System.out.println("reversedArray: "+ Arrays.toString(reverseArray));
    }
}
