public class main {

    public static void main(String[] args) {

        Specialty SE = new Specialty("Software Engineering", 100, 64);
        Specialty PE = new Specialty("PE", 0, 1);
        Specialty math = new Specialty("Mathematics", 500, 2);
        Specialty hist = new Specialty("History", 20, 123);

        Student st1 = new Student("Ivan", "Ivanov", 1, SE);
        Student st2 = new Student("Vasiliy", "Voronov", 13, math);
        Student st3 = new Student("Alex", "Gulyaev", 22, PE);

        University SFU = new University("Siberian Federal University", "Krasnoyarsk",
                123456789);

        SFU.addNewSpecialty(SE);
        SFU.addNewSpecialty(PE);
        SFU.addNewSpecialty(math);
        SFU.addNewSpecialty(hist);

        SFU.addNewStudent(st1);
        SFU.addNewStudent(st2);
        SFU.addNewStudent(st3);

        System.out.println(SFU.getStudentByName("Alex").getSpecialty().getName());
    }

}

