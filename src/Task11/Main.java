package Task11;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] d = {2,3,4,4,4,2,4,3};
        for(int i = 0; i < d.length; ++i)
            if(d[i] == 2)
                d[i] = 5;

        System.out.println(Arrays.toString(d));

    }
}
