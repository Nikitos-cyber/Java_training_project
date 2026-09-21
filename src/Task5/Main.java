package Task5;

public class Main {


    public static void main(String[] args) {
        double[] arr =  {1.3, 3.2, 5.1, 4.7};
        StringBuilder s = new StringBuilder();
        s.append("Сумма чисел массива: " + sum(arr));
        s.append("\nНаибольший элемент масиива: " + max(arr));
        System.out.println(s);
        showArray(arr);


    }

    static double sum(double[] arr){
        double result = arr[0];
       for(int i = 1; i < arr.length; ++i){
           result += arr[i];
       }
       return result;
    }

    static double max(double[] arr){
        double max = arr[0];
        for(int i = 1; i < arr.length; ++i)
            if(max < arr[i])
                max = arr[i];
        return max;
    }

    static void showArray(double[] arr){
        System.out.println(java.util.Arrays.toString(arr));
    }

}
