package Practice_6.Task_6to9;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Printable {

    private List<Printable> books;
    public Shop() {
        books = new ArrayList<>();
    }

    public void addBook(String bookTitle) {
        books.add(new Book(bookTitle));
    }

    @Override
    public void print() {
        for (Printable book : books) book.print();
    }

    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.addBook("Гарри Потер");
        shop.addBook("Капитанская дочка");
        shop.addBook("Судьба человека");

        shop.print();
    }
}
