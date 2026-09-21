package Task19;

public class Main {
    public static void main(String[] args) {

        final int size = 4 ;
        String[] strings = new String[size * size];
        int k = 0;
        for(int i = 0; i < size ; ++i ){
            for(char ch = 'A'; ch < 'E'; ++ch){
                strings[k++] = "" + ch + (size - i) + " ";
            }
        }

       for(int i = 0; i < size * size; ++i) {
           if (i  % 4 == 0 && i != 0)
               System.out.print("\n");
                System.out.print(strings[i]);
       }
    }
}
