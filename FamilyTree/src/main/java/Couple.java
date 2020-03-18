import java.util.ArrayList;
import java.util.List;

public class Couple {
    private Person bride;
    private Person groom;
    private List<Person> childrenList;

    public Couple(Person groom,Person bride){
        this.groom = groom;
        this.bride = bride;
        childrenList = new ArrayList<Person>();
    }

    public Person getPartner(Person person){
        if(person.equals(bride)){
            return groom;
        }
        else{
            return bride;
        }
    }

    public Person getGroom(){
        return groom;
    }

    public Person getBride(){
        return bride;
    }

    public Person giveBirth(String name, Gender gender) {
        Person person = new Person(name,gender);
        this.childrenList.add(person);
        person.assignParent(this);
        return person;
    }

    public List<Person> getChildrens(){
        return this.childrenList;
    }
}
