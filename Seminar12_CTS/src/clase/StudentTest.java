package clase;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testConstructorRightName() {
        String nume="Ion";
        Student student=new Student(nume);
        assertEquals(nume,student.getNume());
    }

    @Test
    public void testListAddNote() {
        Student student = new Student();
        int nota =8;
        student.adaugaNota(nota);
        assertEquals(nota,student.getNota(0));

    }

    @Test
    public void testListSize() {
        Student student = new Student();
        int nota=8;
        student.adaugaNota(nota);
        assertEquals(1,student.getNote().size());
    }

}