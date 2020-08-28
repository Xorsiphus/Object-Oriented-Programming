import java.util.ArrayList;

    public class DataOperations {

        private ArrayList<Person> pData;

        public DataOperations(ArrayList<Person> Data) {
            pData = Data;
        }

        public void AddP(int position, String name, int year, String inf){
            var builtPerson = new Person_Builder();
            builtPerson.BuildStrings(name, inf);
            builtPerson.BuildNumbers(year, position);
            pData.add(builtPerson.GetPerson());
        }

        public void DelP(int number){
            pData.remove(number);
        }

        public Person GetLastPerson(){
            return pData.get(pData.size() - 1);
        }

}
