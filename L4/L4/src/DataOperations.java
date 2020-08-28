import java.util.ArrayList;

    public class DataOperations {

        private ArrayList<Person> pData;

        public DataOperations(ArrayList<Person> Data) {
            pData = Data;
        }

        public void AddP(int position, String name, int year, String inf){
            pData.add(new Person(position, name, year, inf));
        }

        public Person GetLastPerson(){
            return pData.get(pData.size() - 1);
        }

}
