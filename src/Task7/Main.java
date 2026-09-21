package Task7;

public class Main {


    public static void main(String[] args) {
        String[] str = {"Hello", "world", "!"};
        changeReversArray(str);
        System.out.println(java.util.Arrays.toString(str));
    }

    static void changeReversArray(String[] str){

        for(int i = 0; i < (str.length / 2); ++i){
            String val = str[i];
            str[i] = str[str.length - 1 - i];
            str[str.length - 1 - i] = val;
        }
    }

}
