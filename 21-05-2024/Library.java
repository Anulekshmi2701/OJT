import java.util.ArrayList;

public class Library {
    private ArrayList<String> books = new ArrayList<>();

    public void addBook(String bookName) {
        books.add(bookName);
    }

    public void removeBook(String bookName) {
        books.remove(bookName);
    }

    public void displayBooks() {
        for (String book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Book 1");
        library.addBook("Book 2");
        library.addBook("Book 3");
        library.displayBooks();
        library.removeBook("Book 2");
        library.displayBooks();
    }
}

