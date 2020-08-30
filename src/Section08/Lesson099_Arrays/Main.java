package Section08.Lesson099_Arrays;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Inform the total number of integers: ");
        int size = sc.nextInt();
        if(size < 2){
            System.out.println("Invalid size. Minimum value is 2");
            System.exit(1);
        }
        int[] enteredArray = getIntegers(size);
        System.out.println("Array entered: "+ printArray(enteredArray));

        int[] sortedArray = sortIntegers(enteredArray);
        System.out.println("Array in descending order: "+ printArray(sortedArray));

    }

    public static int[] getIntegers(int size){
        System.out.println("Enter "+size+" integer values.\r");
        int[] newArray = new int[size];
        for(int i=0; i<newArray.length; i++){
            newArray[i] = sc.nextInt();
        }
        return newArray;
    }

    public static String printArray(int[] array){

        String arrayPrinted = "";

        for(int i=0; i<array.length; i++){
            arrayPrinted += "["+array[i]+"] ";
        }
        return arrayPrinted;
    }

    public static int[] sortIntegers(int[] array){
        int temp;
        for (int i=0; i<(array.length-1); i++){
            for (int j=(i+1); j<array.length;j++){
                if(array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
