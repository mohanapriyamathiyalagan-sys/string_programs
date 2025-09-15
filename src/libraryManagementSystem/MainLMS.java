package libraryManagementSystem;

public class MainLMS {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book(1, "Java Programming", "James");
        Book book2 = new Book(2, "Python Programming", "JamesBond");
        Book book3 = new Book(3, "Java programming advanced", "James");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.displayAvailableBooks();

        library.borrowBook("Java Programming");
        library.borrowBook("Java Programming");
        library.returnBook("Java Programming");


        library.displayAvailableBooks();




    }
}
