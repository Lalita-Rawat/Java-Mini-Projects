import java.util.ArrayList;

public class Teacher extends LibraryMember {
    private static final int MAX_BOOKS = 10;

    public Teacher(String name) {
        super(name);
    }

    @Override
    public void borrowBook(ArrayList<String> libraryBooks) throws Exception {
        if (getBorrowedBooks().size() >= MAX_BOOKS) {
            throw new Exception("Teacher borrowing limit reached (" + MAX_BOOKS + ").");
        }
        if (libraryBooks.isEmpty()) {
            throw new Exception("No books available in the library.");
        }

        String book = libraryBooks.remove(0);
        addBorrowedBook(book);
        System.out.println(getName() + " borrowed '" + book + "'. Total borrowed: " + getBorrowedBooks().size());
    }

    @Override
    public void returnBook(ArrayList<String> libraryBooks) throws Exception {
        if (getBorrowedBooks().isEmpty()) {
            throw new Exception("No borrowed books to return.");
        }

        String book = getBorrowedBooks().remove(0);
        libraryBooks.add(book);
        System.out.println(getName() + " returned '" + book + "'.");
    }
}
