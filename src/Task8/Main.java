package Task8;

import java.util.Locale;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.printf("Меню: \n0 - Выход из программы; \n1 - Удалить пробелы; \n2 - Сделать все строчными;\n3 - Сделать все заглавными; \n4 - Посчитать количество символов; \nВведите число: ");
            int d = scanner. nextInt();
            scanner.nextLine();
            if(d == 0) {
                System.out.println("Завершение программы...");
                break;
            }
            System.out.println("Введите строку: ");
            String str = scanner.nextLine();

            switch(d){
                case 1:{
                    str = str.replace(" ", "");
                    break;
                }
                case 2:{
                    str = str.toLowerCase(Locale.ROOT);
                    break;
                }
                case 3:{
                    str = str.toUpperCase(Locale.ROOT);
                    break;
                }
                case 4:{
                    System.out.printf("Количество символов: %d", str.length());
                    break;
                }
                default:
                    System.out.println("Нет такого пункта меню!!!");
            }

            System.out.println("\nСтрока: " + str);

        }while(true);

    }


}
