package schoolNotes.JavaCollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PersonManager {
    Person currentPerson;
    public static PersonManager instance = null;
    private List<Person> personList = new LinkedList<>();



    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public void addPersons(Person person){
        personList.add(person);
    }

    public static PersonManager getInstance() {
        if(instance == null){
            instance = new PersonManager();
        }
        return instance ;
    }

    public Person getNextPerson() {
        return personList.get(0);
    }

    Iterator<Person> personIterator = personList.iterator();

    public Person whoIsNext(){
        while(personIterator.hasNext()){
            Person currentPerson = personIterator.next();
        }
        return currentPerson;
    }
}
