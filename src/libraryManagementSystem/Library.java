package libraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added Books: " + book.getTitle());
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Book is borrowed " + title);
                    return;
                } else {
                    System.out.println("Book is not borrowed " + title);
                    return;
                }
            }
            System.out.println("Book is not available" + title);
        }
    }
        public void returnBook (String title){
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    if (book.isAvailable()) {
                        book.setAvailable(false);
                        System.out.println("Book is returned" + title);
                        return;
                    } else {
                        System.out.println("Book is not returned " + title);
                        return;
                    }
                }
                System.out.println("Book is not available" + title);

            }

        }

    public void displayAvailableBooks(){
        System.out.println("Available books: ");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle()+ " by "+book.getAuthor());
            }
        }

    }
}
