public class Textbook extends Book {
    private String genre;

    public Textbook(String pName, int pYear, String pGenre) {
        super(pName, pYear);
        this.genre = pGenre;
    }


    public String printInfo() {
        return super.printInfo() + "; Genre: " + genre + ".";
    }

}