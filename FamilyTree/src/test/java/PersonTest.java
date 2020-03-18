import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testMarry(){
        Person groom = new Person("King Shan",Gender.Male);
        Person bride = new Person("Queen Anga",Gender.Female);
        groom.marry(bride);
        assert(groom.getPartner().equals(bride));
        assert(bride.getPartner().equals(groom));
    }

    @Test
    public void testGiveBirth(){
        Person groom = new Person("King Shan",Gender.Male);
        Person bride = new Person("Queen Anga",Gender.Female);
        Couple couple =  groom.marry(bride);
        Person son = couple.giveBirth("Chit",Gender.Male);
        assert(couple.getChildrens().size() == 1);
        assert(couple.getChildrens().get(0).equals(son));
    }

    @Test
    public void testGetFather(){
        Person groom = new Person("King Shan",Gender.Male);
        Person bride = new Person("Queen Anga",Gender.Female);
        Couple couple =  groom.marry(bride);
        Person son = couple.giveBirth("Chit",Gender.Male);
        assert(son.getFather().equals(groom));
    }

    @Test
    public void testGetMother(){
        Person groom = new Person("King Shan",Gender.Male);
        Person bride = new Person("Queen Anga",Gender.Female);
        Couple couple =  groom.marry(bride);
        Person son = couple.giveBirth("Chit",Gender.Male);
        assert(son.getMother().equals(bride));
    }

    @Test
    public void testGetSiblings(){
        Person groom = new Person("King Shan",Gender.Male);
        Person bride = new Person("Queen Anga",Gender.Female);
        Couple couple =  groom.marry(bride);
        Person son = couple.giveBirth("Chit",Gender.Male);
        Person daugther = couple.giveBirth("chitra",Gender.Female);
        Person son2 = couple.giveBirth("hari",Gender.Male);
        assert(son.getSiblings().size() == 2);
    }

    @Test
    public void testGetBrothers(){
        Person groom = new Person("King Shan",Gender.Male);
        Person bride = new Person("Queen Anga",Gender.Female);
        Couple couple =  groom.marry(bride);
        Person son = couple.giveBirth("Chit",Gender.Male);
        Person daugther = couple.giveBirth("chitra",Gender.Female);
        Person son2 = couple.giveBirth("hari",Gender.Male);
        assert(son.getBrothers().size() == 1);
        assert(son.getBrothers().get(0).equals(son2));
        assert(daugther.getBrothers().size() == 2);
        assert(son2.getBrothers().size() == 1);
    }

    @Test
    public void testGetSisters(){
        Person groom = new Person("King Shan",Gender.Male);
        Person bride = new Person("Queen Anga",Gender.Female);
        Couple couple =  groom.marry(bride);
        Person son = couple.giveBirth("Chit",Gender.Male);
        Person daugther = couple.giveBirth("chitra",Gender.Female);
        Person son2 = couple.giveBirth("hari",Gender.Male);
        assert(son.getSisters().size() == 1);
        assert(son.getSisters().get(0).equals(daugther));
        assert(daugther.getSisters().size() == 0);
        assert(son2.getSisters().size() == 1);
    }

    @Test
    public void testWhole(){
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

        System.out.println(" Dritha Family");
        System.out.println(" Paternal Uncle"+dirtha.getFather().getBrothers());
    }

}
