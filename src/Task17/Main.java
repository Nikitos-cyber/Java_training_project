package Task17;

import java.util.Arrays;

public class Main {
    public static short size = 9;
    public static int[][] ints = new int[size][];

    public static void main(String[] args) {

        for (int i = 0; i < size; ++i){
            ints[i] = new int[i + 1];
            for(int j = 0; j < i + 1 ; ++j){

                if( j == 0 || j == i)
                    ints[i][j] = 1;

                else ints[i][j] = ints[i - 1][j - 1] + ints[i - 1][j];

            }
        }





        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(ints[i]));
        }
    }
}
