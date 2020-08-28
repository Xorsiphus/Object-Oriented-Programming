import java.util.ArrayList;

public class University {
    private String name;
    private String location;
    private int posInRating;
    private ArrayList<Student> students;
    private ArrayList<Specialty> specialties;

    public University(String pName, String pLocation, int pPosInRating) {
        this.name = pName;
        this.location = pLocation;
        this.posInRating = pPosInRating;
        this.students = new ArrayList<Student>();
        this.specialties = new ArrayList<Specialty>();
    }

    public ArrayList<Student> getStudentsArray() {
        return students;
    }

    public ArrayList<Specialty> getSpecialties() {
        return specialties;
    }

    public String getName() {
        return name;
    }

    public void addNewStudent(Student pNew) {
        this.students.add(pNew);
    }

    public void addNewSpecialty(Specialty pNew){
        this.specialties.add(pNew);
    }

    public Student getStudentByName(String tempName) {

        for(int i = 0; i < students.size(); i++) {
            if(this.students.get(i).getFirstName().equals(tempName)) {
                return this.students.get(i);
            }
        }
        return null;
    }

}