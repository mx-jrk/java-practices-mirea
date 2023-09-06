package Practice_2.Task_1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Alex", "alex@gmail.ru", 'm');
        Author author2 = new Author("Jane", "jane@gmail.ru", 'f');

        author2.setEmail("jane@gmail.com");

        System.out.println(author1.getName() +
                '\n' + author1.getEmail() +
                '\n' + author1.getGender());

        System.out.println(author2.toString());
    }
}
