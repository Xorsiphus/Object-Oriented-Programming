import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Window extends JDialog {
    private JPanel contentPane;
    private JButton ReportButton;
    private JTextField FirstTextField;
    private SuperTextField SecondTextField;
    private JSpinner spinner1;
    private JButton DeleteButton;
    private JButton AddButton;
    private JTable table1;
    private JTextField ThirdTextField;
    private Controller controller;
    private DefaultTableModel TableModel;


    private Window() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(ReportButton);
        spinner1.setModel(new SpinnerNumberModel(1, 1, 200, 1));

        table1.setModel(Table());

        setSize(600, 700);
        setMinimumSize(new Dimension(600, 700));


        AddButton.addActionListener(aE -> AddPersonToTable());
        DeleteButton.addActionListener(aE -> DeletePersonFromTable());
        ReportButton.addActionListener(aE -> controller.PrintReport(this, TableModel.getRowCount()));

        FirstTextField.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (!FirstTextField.getText().equals("")) {
                    FirstTextField.setText("");
                    FirstTextField.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (FirstTextField.getText().equals("")) {
                    FirstTextField.setText("ФИО");
                    FirstTextField.setForeground(Color.GRAY);
                }
            }
        });


        SecondTextField.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (!SecondTextField.getText().equals("")) {
                    SecondTextField.setText("");
                    SecondTextField.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (SecondTextField.getText().equals("")) {
                    SecondTextField.setText("Год рождения");
                    SecondTextField.setForeground(Color.GRAY);
                }
            }
        });

        ThirdTextField.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (!ThirdTextField.getText().equals("")) {
                    ThirdTextField.setText("");
                    ThirdTextField.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (ThirdTextField.getText().equals("")) {
                    ThirdTextField.setText("Информация");
                    ThirdTextField.setForeground(Color.GRAY);
                }
            }
        });
    }

    private void AddPersonToTable()
    {
        if (!SecondTextField.isDigit() || Integer.parseInt(SecondTextField.getText()) > 2019 ||
                Integer.parseInt(SecondTextField.getText()) < 0)
        {
            JOptionPane.showMessageDialog(this, "Введён некорректный год!");
        }
        else
            {
            Person temp;
            temp = controller.AddNewPerson(FirstTextField.getText(), Integer.parseInt(SecondTextField.getText()),
                    ThirdTextField.getText());

            String[] object = {
                    Integer.toString(temp.getPosition() + 1),
                    temp.getName(),
                    Integer.toString(temp.getYear()),
                    temp.getInf()
            };

            TableModel.addRow(object);
        }
    }

    private void DeletePersonFromTable(){
        if (TableModel.getRowCount() != 0)
            TableModel.removeRow((Integer)spinner1.getValue() - 1);
        else
            JOptionPane.showMessageDialog(this, "Отсутствуют элементы в списке");
    }

    private DefaultTableModel Table() {

        String[] columnNames = {
                "№",
                "ФИО",
                "Год рождения",
                "Информация"
        };

        TableModel = new DefaultTableModel(null, columnNames);

        return TableModel;
    }

    public static void main(String[] args)
    {
        Window dialog = new Window();
        dialog.controller =new Controller(new ArrayList<>());
        //dialog.setTitle("");
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
