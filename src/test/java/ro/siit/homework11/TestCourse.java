package ro.siit.homework11;

import org.junit.Assert;
import org.junit.Test;

public class TestCourse {
    @Test
    public void testCalculOreSaptamana() {
        double numarOreCurs = 500.0;
        Course curs = new Course("Psihologie", "Psihologia scolarului");

        Assert.assertEquals(21.0, curs.calculOreSaptamanal(numarOreCurs), 0.1);
    }
}