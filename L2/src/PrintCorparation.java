import java.util.ArrayList;

public class PrintCorparation {

    private String name;
    private String owner;
    private ArrayList<Book> books;

    public PrintCorparation(String pName, String pOwner, ArrayList<Book> qBooks) {
        this.name = pName;
        this.owner = pOwner;

        books = qBooks;
    }

    public String getPCorparationInfo() {

        String outputStr = "PrintCorparation's name: " + name + "; PrintCorparations's owner: " + owner + ";\n";

        for(int i = 0; i < books.size(); i++) {
            outputStr = outputStr + (i+1) + ") " + books.get(i).printInfo() + "\n";
        }

        return outputStr;
    }

}
