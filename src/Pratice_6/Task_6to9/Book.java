package Pratice_6.Task_6to9;

public class Book implements Printable {

    private final String bookTitle;

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    @Override
    public void print() {
        System.out.println("Книга «" + bookTitle + "» распечатана");
    }


}
