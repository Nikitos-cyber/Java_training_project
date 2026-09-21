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

        System.out.printf("exit...");

    }
}
