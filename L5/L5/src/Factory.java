public abstract class Factory {

    private Person tempPerson;

    protected Person BuildStrings(String name)
    {
        tempPerson.setName(name);
        return tempPerson;
    }

    protected Person BuildNumbers(int number)
    {
        tempPerson.setPosition(number);
        return tempPerson;
    }

    protected Person GetPerson()
    {
        return tempPerson;
    }

    protected Factory()
    {
        this.tempPerson = new Person();
    }

}
