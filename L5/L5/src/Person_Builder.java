public class Person_Builder extends Factory {

    public void BuildStrings(String name, String inf)
    {
        super.BuildStrings(name).setInf(inf);
    }

    public void BuildNumbers(int year, int number)
    {
        super.BuildNumbers(number).setYear(year);
    }

    public Person GetPerson()
    {
        return super.GetPerson();
    }


}
