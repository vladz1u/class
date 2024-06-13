package books;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> listBooks = new ArrayList<>();

    public Library(ArrayList<Book> listBooks) {
        this.listBooks = listBooks;
    }

    public void addBook(String title, String author, int publicationYear) {
        Book book = new Book(title, author, publicationYear);
        listBooks.add(book);
    }

    public void removeBook(int i) {
        System.out.println("Book behind the " + i + " index has been deleted");
        this.listBooks.remove(i);
    }

    public void printBooks(){
        for (Book book : listBooks) {
            System.out.println(book.toString());
        }
    }

}
