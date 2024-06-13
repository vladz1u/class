package books;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Library library = new Library(new ArrayList<>());
        library.addBook("Война и мир", "Лев Толстой", 1869);
        library.printBooks();
        library.removeBook(0);
        library.printBooks();
    }
}
