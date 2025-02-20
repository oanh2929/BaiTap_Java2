package Bai2_2;



public class TestMain {
    public static void main(String[] args) {

        Author author1 = new Author("John Doe", "john@example.com", 'M');
        Author author2 = new Author("Jane Smith", "jane@example.com", 'F');

        Author[] authors = {author1, author2};

        Book book = new Book("Advanced Java", authors, 29.99, 100);

        System.out.println(book);
        System.out.println("Author Names: " + book.getAuthorNames());
    }
}


