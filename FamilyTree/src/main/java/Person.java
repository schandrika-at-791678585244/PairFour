import java.util.ArrayList;
import java.util.List;

enum Gender {
    Male,Female
}

public class Person {
    private String name;
    private Gender gender;
    private Couple couple;
    private Couple parent;

    public Person(String name, Gender gender){
        this.name = name;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public Gender getGender(){
        return gender;
    }

    public Couple marry(Person person){
        Person groom, bride;
        if(this.gender.equals(Gender.Male)){
            groom = this;
            bride = person;
        }
        else{
            groom = person;
            bride = this;
        }
        this.couple = new Couple(groom,bride);
        person.couple = this.couple;
        return this.couple;
    }

    public Person getPartner(){
        return this.couple.getPartner(this);
    }

    public void assignParent(Couple parent){
        this.parent = parent;
    }

    public Person getFather(){
        return this.parent.getGroom();
    }

    public Person getMother(){
        return this.parent.getBride();
    }

    public List<Person> getSiblings() {
        List<Person> siblings =new ArrayList<>(this.parent.getChildrens());
        siblings.removeIf(person -> this.equals(person));
        return siblings;
    }

    public List<Person> getBrothers() {
        List<Person> brothers = this.getSiblings();
        brothers.removeIf(person -> person.gender.equals(Gender.Female));
        return brothers;
    }

    public List<Person> getSisters() {
        List<Person> sisters = this.getSiblings();
        sisters.removeIf(person -> person.gender.equals(Gender.Male));
        return sisters;
    }


    @Override
    public boolean equals(Object obj){
        if(obj instanceof Person){
            Person p = (Person) obj;
            return p.getName().equals(this.name) && p.getGender().equals(this.gender);
        }
        else{
            return false;
        }
    }

    @Override
    public String toString(){
        return name;
    }


}
