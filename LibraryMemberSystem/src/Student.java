import java.util.ArrayList;

public class Student extends LibraryMember {
    private static final int MAX_BOOKS = 5;

    public Student(String name) {
        super(name);
    }

    @Override
    public void borrowBook(ArrayList<String> libraryBooks) throws Exception {
        if (getBorrowedBooks().size() >= MAX_BOOKS) {
            throw new Exception("Student borrowing limit reached (" + MAX_BOOKS + ").");
        }
        if (libraryBooks.isEmpty()) {
            throw new Exception("No books available in the library.");
        }

        String book = libraryBooks.remove(0); // borrow first available
        addBorrowedBook(book);
        System.out.println(getName() + " borrowed '" + book + "'. Total borrowed: " + getBorrowedBooks().size());
    }

    @Override
    public void returnBook(ArrayList<String> libraryBooks) throws Exception {
        if (getBorrowedBooks().isEmpty()) {
            throw new Exception("No borrowed books to return.");
        }

        String book = getBorrowedBooks().remove(0); // return first borrowed
        libraryBooks.add(book);
        System.out.println(getName() + " returned '" + book + "'.");
    }
}
