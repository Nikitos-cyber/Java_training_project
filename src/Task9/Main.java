package Task9;

public class Main {
    public static void main(String[] args) {


        int[] arr = {27, 97, 86, 88, 31, 46, 59, 48, 16, 4};

        for(int i = arr.length - 1; i >= 0; --i)
            System.out.print(arr[i] + " ");

        for(int i = 0; i < arr.length - 1; i ++){
            for(int j = 0; j < arr.length - 1 - i; j ++){
                if(arr[j] > arr[j + 1]){
                    arr[j] ^= arr[j + 1];
                    arr[j + 1] ^= arr[j];
                    arr[j] ^= arr[j + 1];
                }
            }
        }

        System.out.println("\n\n" + java.util.Arrays.toString(arr));



    }
}
