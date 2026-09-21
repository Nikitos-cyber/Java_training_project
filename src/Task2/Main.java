package Task2;

import java.util.Scanner;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Введите пароль от 8 до 15 символов: ");
            String passwd = "/n";
            passwd = scanner.nextLine();
            if (passwd.length() < 8) {
                System.out.println("Слишком короткий пароль!");
                continue;
            } else if (passwd.length() > 15) {
                System.out.println("Слишеом длинный пароль");
                continue;
            }

            System.out.println("Пароль введен успешно!");
            break;

        }
    }

}
