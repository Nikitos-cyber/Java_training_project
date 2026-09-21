package Array;

import  java.util.Arrays;
import  java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] copy = new int[arr.length];

        Random rand = new Random();

        for(int i = 0; i < arr.length; ++i)
            arr[i] = rand.nextInt(10,100);

        Arrays.sort(arr);
        copy = Arrays.copyOf(arr,arr.length);
        Arrays.sort(copy);

        System.out.printf("Arr: %s", Arrays.toString(arr));
        System.out.println(String.format("\nCopy: %1$s", Arrays.toString(copy)));
        System.out.println("Equals: Arr and Copy: " + Arrays.equals(arr,copy));
        System.out.println("deepEquals: Arr and Copy: " + Arrays.deepEquals(arr,copy));
    }
}
