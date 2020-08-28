public class Student {
    private String firstName;
    private String secondName;
    private int groupNumber;
    private Specialty specialty;

    public Student(String pFirstName, String pSecondName, int pGroupNumber, Specialty pSpecialty) {
        this.firstName = pFirstName;
        this.secondName = pSecondName;
        this.groupNumber = pGroupNumber;
        this.specialty = pSpecialty; // Связывание объектов
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public Specialty getSpecialty() {
        return specialty;//Возвращение ссылки на связанный объект
    }
}