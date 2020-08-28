public class Magazine extends Book {

    private String style;

    public Magazine(String pName, int pYear, String pStyle) {
        super(pName, pYear);
        this.style = pStyle;
    }

    public String printInfo() {
        return super.printInfo() + "; Style: " + style + ".";
    }

}
