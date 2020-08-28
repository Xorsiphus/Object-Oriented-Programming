public class main {

    public static void main(String[] args) {

        Magazine M1 = new Magazine("ABC", 2007, "S");
        Textbook TB1 = new Textbook("ZXC", 2003, "F");

        Book.setMaterial();
        Book.addBook(M1);
        Book.addBook(TB1);

        PrintCorparation PC1 = new PrintCorparation("QWE", "I.O.", Book.getBooks());

        System.out.println(PC1.getPCorparationInfo());

    }

}

