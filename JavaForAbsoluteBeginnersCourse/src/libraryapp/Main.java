package libraryapp;

public class Main {
    public static void main(String[] args) {
        LibraryApp app = new LibraryApp();
        app.searchByIsbn("25274");
        app.searchByTitle("Castle");
        app.checkOutBooks("86917");
        app.checkOutBooks("72391");
        app.checkInBooks("39662");
    }
}
