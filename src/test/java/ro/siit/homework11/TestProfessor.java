package ro.siit.homework11;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

public class TestProfessor {
    @Test
    public void testCalculVechime() {
        int anAngajare = 2018;
        Professor professor1 = new Professor(anAngajare);

        Assert.assertEquals((2021-anAngajare), professor1.calculVechime());
    }

    @Test
    public void testCalculSalariu() {
       int anAng = 2000;
        double salariu = 3500.0;
        System.out.println(2021-anAng);

        Professor professor = new Professor(salariu, anAng);

        Assert.assertEquals((salariu+salariu*0.15), professor.calculSalariu(salariu, anAng), 0.1);
    }
}
