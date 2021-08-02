package ro.siit.homework11;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testConditiePromovareExamen() {
        double notaExamen = 5.0;
        Student student = new Student(notaExamen);

        Assert.assertEquals(false, student.conditiePromovareExamen());
    }

    @Test
    public void testCalculPromovareAn() {
        double medieAn = 3.8;
        Student student = new Student(medieAn);

        Assert.assertEquals("restant", student.calculPromovareAn());
    }

    @Test
    public void testConditieBursa() {
        double medieAn = 9.5;
        int numarRestante = 1;
        Student student = new Student(medieAn, numarRestante);

        Assert.assertEquals(true, student.conditieBursa());
    }

    @Test
    public void testAdaugareRestante() {
        double notaExamen = 8.9;
        int numarRestante = 2;
        Student student = new Student(notaExamen, numarRestante);

        Assert.assertEquals(3, student.adaugaRestante(notaExamen, numarRestante));
    }
}
