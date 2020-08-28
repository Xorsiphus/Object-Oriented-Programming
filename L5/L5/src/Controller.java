import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class Controller {
        private ArrayList<Person> Data;

        public Controller(ArrayList<Person> Data) {
            this.Data = Data;
        }

        public Person AddNewPerson(String name, int year, String inf) {
            var temp = new DataOperations(Data);
            temp.AddP(Data.size(), name, year, inf);
            return temp.GetLastPerson();
        }

        public void DeletePerson(int number) {
            var temp = new DataOperations(Data);
            temp.DelP(number);
        }

        public void PrintReport(Component window, int rowCount){

            JFileChooser chooser = new JFileChooser();
            chooser.setFileFilter(new FileNameExtensionFilter(".txt", "txt"));
            chooser.showSaveDialog(window);
            File selectedFile = chooser.getSelectedFile();
            if(selectedFile == null)
                return;
            FileWriter save = null;

            try {
                if(selectedFile.getName().contains(".txt"))
                    save = new FileWriter(selectedFile);
                else
                    save = new FileWriter(selectedFile + ".txt");
            } catch (IOException e) {
                e.printStackTrace();
            }


            StringBuilder temp;

            String tempV = "| ";

            String tempL = "\n";

            String tempS = ")  ";

            String tempS2 = ") ";

            String tempSp = " ";

            for (int i = 0; i < rowCount; i++)
            {
                String tempI = Integer.toString(i + 1);

                temp = new StringBuilder(tempI);
                if (9 > i) {
                    temp.append(tempS);
                } else
                    temp.append(tempS2);

                String temp2 = Data.get(i).getName();
                String space = tempSp.repeat((20 - temp2.length()) / 2);
                if (temp2.length() < 20)
                    temp.append(space);
                temp.append(Data.get(i).getName());
                if (temp2.length() < 20)
                    temp.append(space);
                temp.append(tempV);

                space = tempSp.repeat((20 - SuperTextField.getCountsOfDigits(Data.get(i).getYear())) / 2);
                if (temp2.length() < 20)
                    temp.append(space);
                temp.append(Data.get(i).getYear());
                if (temp2.length() < 20)
                    temp.append(space);


                temp.append(tempV);
                temp2 = Data.get(i).getInf();
                space = tempSp.repeat((20 - temp2.length()) / 2);
                if (temp2.length() < 20)
                    temp.append(space);
                temp.append(Data.get(i).getInf());

                temp.append(tempL);

                System.out.print(temp);

                try {
                    assert save != null;
                    save.write(temp.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            try {
                Objects.requireNonNull(save).close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

}
