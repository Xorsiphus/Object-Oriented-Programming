import java.util.ArrayList;

public abstract class Book {
    private String name;
    private int year;
    private static String material;
    private static ArrayList<Book> books;

    public Book(String pName, int pYear) {
        this.name = pName;
        this.year = pYear;
    }

    public static void addBook(Book pBook) {
        if(books == null) books = new ArrayList<Book>();
        books.add(pBook);
    }

    public static ArrayList<Book> getBooks() {
        return books;
    }

    public static void setMaterial() {
        material = "Paper";
    }

    public static String getMaterial() {
        return material;
    }

    public String printInfo() {
        return "Name: " + name + "; Year: " + year + "; Material: " + Book.getMaterial();
    }

}
