package Task14;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] logPasswd = new String[10];
        Arrays.fill(logPasswd, " ");
        int capacity = 10;

        while(true) {
            System.out.println("Введите пароль: ");
            while(true) {
                String password = scanner.nextLine();
                if(password.equals("Z")){
                    return;
                }
                int index = Arrays.binarySearch(logPasswd, password);
                if(password.length() < 8){
                    System.out.println("Длинна пароля долна быть больше 8 символов.\nВведите другой пароль: ");
                    continue;
                }
                if (index >= 0  ) {
                    System.out.println("Введите другой пароль:");
                    continue;
                }
                add(logPasswd,password, capacity);
                break;
            }

        }
    }

    static void add(String[] logPasswd,String passwd,final int capacity){
        int index = Arrays.binarySearch(logPasswd," ");
        if(index >= 0){
           logPasswd[index] = passwd;
        }else{
            String[] logPasswdCopy = new String[logPasswd.length + capacity];
            Arrays.fill(logPasswdCopy, " ");
            logPasswdCopy = Arrays.copyOf(logPasswd,logPasswd.length);
            logPasswd = logPasswdCopy;
        }
        System.out.println("Security password verified success");


    }

}
