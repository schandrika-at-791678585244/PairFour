import java.util.List;
import java.util.ArrayList;

public class FamilyTree {

    public static void main(String args[]) {
        List<Person> family = new ArrayList<Person>();
        Person king = new Person("King Shan", Gender.Male);
        family.add(king);
        Person queen = new Person("Queen Anga", Gender.Female);
        family.add(queen);
        Couple couple = king.marry(queen);
        Person chit = couple.giveBirth("Chit",Gender.Male);
        family.add(chit);
        Person amba = new Person("Amba", Gender.Female);
        Couple couple1 = chit.marry(amba);
        family.add(amba);
        Person dirtha = couple1.giveBirth("Dirtha",Gender.Female);
        family.add(dirtha);

        Person jaya = new Person("Jaya", Gender.Male);
        Couple couple4 = dirtha.marry(jaya);
        family.add(jaya);
        Person yodhan = couple4.giveBirth("Yodhan",Gender.Male);
        family.add(yodhan);

        Person tratha = couple1.giveBirth("Tratha",Gender.Female);
        family.add(tratha);
        Person vritha = couple1.giveBirth("Vritha",Gender.Male);
        family.add(vritha);


        Person ish = couple.giveBirth("Ish",Gender.Male);
        family.add(ish);


        Person vich = couple.giveBirth("Vich",Gender.Male);
        family.add(vich);
        Person lika = new Person("Lika", Gender.Female);
        Couple couple3 = vich.marry(lika);
        family.add(lika);

        Person vila = couple3.giveBirth("Vila",Gender.Female);
        family.add(vila);
        Person chika = couple3.giveBirth("Chika",Gender.Female);
        family.add(chika);

        System.out.println(" Dirtha Family");
        System.out.println(" Paternal Uncle"+dirtha.getFather().getBrothers());
    }
}
