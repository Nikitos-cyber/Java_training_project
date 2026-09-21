package TestHome;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите строку: ");
    String str = scanner.nextLine();
    str = str.trim();

    System.out.println("Введите ключ: ");
    int key = scanner.nextInt();


    String alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


    StringBuilder encode = new StringBuilder();

    for(int i = 0; i < str.length(); ++i){

        if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
            encode.append(alp.charAt((alp.indexOf(str.charAt(i))  + key) % 26));
        }else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
        encode.append(Character.toString(alp.charAt((alp.indexOf(str.charAt(i))  + key) % 26)).toLowerCase(Locale.ROOT));
        }
        else {
            encode.append(str.charAt(i));
        }

    }

        System.out.println("Результат: " + encode);


    }

}