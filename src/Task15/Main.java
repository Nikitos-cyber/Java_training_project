package Task15;

import java.util.Arrays;

public class Main {

    public static int[] numbers = new int[100];

    public static void main(String[] args) {

        for(int i = 0; i < numbers.length; ++i){
            if((i + 1) % 2 == 0)
                numbers[i] -=  (i + 1);
            else
                numbers[i] = i + 1;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
