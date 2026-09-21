package Task10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] store = new String[12];

        while (true){
            System.out.print("Меню: \n0 - Выход из программы;\n1 - Добавить;\n2 - Проверить;\n3 - Удалить;\nВведите число:");
            int item = scanner.nextInt();

            if(item == 0){
                System.out.println("Завершение программы...");
                scanner.close();
                return;
            }

            scanner.nextLine();
            System.out.println("Введите строку: ");
            String str = scanner.nextLine();

            switch(item){
                case 1:{
                    add(store,str);
                    break;
                }
                case 2: {
                    find(store,str);
                    break;
                }
                case 3:{
                    remove(store,str);
                    break;
                }
            }
        }

    }
    static void add(String[] store, String str){

        int index = -1;

        for(int i = 0; i < store.length; ++i){
            if(index < 0 && store[i] == null){
                index = i;
            }else if(store[i] != null && store[i].equals(str)){
                System.out.println("Предмет уже есть");
                return;
            }
        }

        if(index < 0) {
            System.out.println("Невозможно добавить предмет. Место на складе кончилось");
            return;
        }
        store[index] = str;
        System.out.println("Успешно добавлено");
    }

    static void remove(String[] store, String str){
        int index = -1;

        for(int i = 0; i < store.length; ++i){

            if(store[i] != null && store[i].equals(str)){
                System.out.println("Предмет удален");
                store[i] = null;
                return;
            }else if(index < 0 && store[i] != null){
                index = i;
            }
        }

        if(index < 0){
            System.out.println("Невозможно удалить предмет с пустого склада!");
            return;
        }

        System.out.println("Невозможно удалить не существующий предмет!");

    }

    static void find(String[] store, String str){
        for(int i = 0; i < store.length; ++i)
            if(store[i] != null && store[i].equals(str)){
                System.out.println(store[i]);
                return;
            }
        System.out.println("Предмет не найден!");
    }



}
