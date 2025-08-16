import java.util.ArrayList;

// Abstract base class: LibraryMember
public abstract class LibraryMember {
    private String name;
    private ArrayList<String> borrowedBooks;

    public LibraryMember(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void addBorrowedBook(String book) {
        borrowedBooks.add(book);
    }

    public void removeBorrowedBook(String book) {
        borrowedBooks.remove(book);
    }

    public abstract void borrowBook(ArrayList<String> libraryBooks) throws Exception;

    public abstract void returnBook(ArrayList<String> libraryBooks) throws Exception;
}
