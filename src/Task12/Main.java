package Task12;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите почту: ");
        String domen = scanner.nextLine();
        System.out.println(domen.substring((domen.indexOf('@') + 1)));

    }

}
