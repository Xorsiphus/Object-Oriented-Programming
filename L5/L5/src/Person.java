public class Person
{
    private String name;
    private int year;
    private int position;
    private String inf;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getInf() {
        return inf;
    }

    public void setInf(String inf) { this.inf = inf; }

    public Person(int position, String name, int year, String inf)
    {
        this.position = position;
        this.name = name;
        this.year = year;
        this.inf = inf;
    }

    public Person()
    {
        this.position = 0;
        this.name = "";
        this.year = 0;
        this.inf = "";
    }

}
