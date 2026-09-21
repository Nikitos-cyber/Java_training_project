package Task4;

public class Task4 {
    public static void main(String[] args) {

        Book[] books = new Book[5];
        java.util.Arrays.fill(books, null);


        checkParametr(books, "The Hobbit", 1937);
        checkParametr(books, "The HaryPotter", 2007);
        checkParametr(books, "The Hobbit", 1937);
        checkParametr(books, "The HaryPotter", 2007);
        checkParametr(books, "The Hobbit", 1937);
        checkParametr(books, "The HaryPotter", 2007);

        showArray(books);


    }

    static void checkParametr(Book[] books, final String name, final int year) {

        for (int i = 0; i < books.length; ++i) {
            if (books[i] != null && books[i].getNameBook().equalsIgnoreCase(name) && year == books[i].getDate()) {
                System.out.println("Книга найдена! Выдача книги...");
                books[i] = null;
                System.out.println("Книга выдана!");
                return;
            }
        }

            int index = -1;
            for (int j = 0; j < books.length; ++j) {
                if (books[j] == null) {
                    index = j;
                break;
                }
            }
            if (index >= 0) {
                books[index] = new Book(name, 231, year);
                System.out.println("Книга добавлена!");

            } else {
                System.out.println("Картотека заполнена!");

            }

    }




    static void showArray(Book[] books) {
        for (int i = 0; i < books.length; ++i) {
            if (books[i] != null)
                System.out.printf("книга №%d: название: %s, год издания: %d., цена - %dusd\n", i + 1, books[i].getNameBook(), books[i].getDate(), books[i].getCost());
        }
    }

}


class Book {
    private String nameBook;
    private int cost = 0;
    private int date = 0;

    Book(final String nameBook, final int cost, final int date) {
        this.nameBook = nameBook;
        this.cost = cost;
        this.date = date;
    }

    final int getCost() {
        return this.cost;
    }

    final int getDate() {
        return this.date;
    }

    String getNameBook() {
        return nameBook;
    }

}
