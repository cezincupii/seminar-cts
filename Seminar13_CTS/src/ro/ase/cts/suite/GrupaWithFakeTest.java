package ro.ase.cts.suite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.cts.classes.FakeStudent;
import ro.ase.cts.classes.Grupa;

import static org.junit.Assert.assertEquals;


public class GrupaWithFakeTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Category({TesteNormale.class,TesteGetPromovabilitate.class})
    @Test
    public void promovabilitateFaraRestanteTest() {
        FakeStudent studentFake = new FakeStudent();
        studentFake.setAreRestanta(false);
        Grupa grupa = new Grupa(1079);
        grupa.adaugaStudent(studentFake);

        assertEquals(1, grupa.getPromovabilitate(), 0.01f);
    }

    @Category({TesteUrgente.class,TesteGetPromovabilitate.class})
    @Test
    public void promovabilitateCuRestanteTest() {
        FakeStudent studentFake = new FakeStudent();
        studentFake.setAreRestanta(true);
        Grupa grupa = new Grupa(1079);
        grupa.adaugaStudent(studentFake);

        assertEquals(0, grupa.getPromovabilitate(), 0.01f);

    }

}
