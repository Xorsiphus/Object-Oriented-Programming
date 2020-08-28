import javax.swing.*;

    public class SuperTextField extends JTextField {

        public boolean isDigit() throws NumberFormatException {
            try {
                String s = super.getText();
                Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }

        public static int getCountsOfDigits(long number) {
            return String.valueOf(Math.abs(number)).length();
        }

}
