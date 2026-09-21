package Task3;

public class Main {

    public static void main(String[] args){

        String[] names = {"Саша", "Игорь", "Миша", "Коля", "Владимир"};
        int[][] digitals = new int[][]{{3,4,5,4,5},{5,4,4,5,5}};
        for(int i = 0; i < names.length; ++i){
            int sum = 0;
            for(int j = 0; j < digitals.length; ++j){
                sum += digitals[j][i];
            }
            System.out.println(names[i] + " " + sum);
        }
    }

}
