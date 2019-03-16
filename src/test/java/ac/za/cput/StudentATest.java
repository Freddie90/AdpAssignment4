package ac.za.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentATest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void StudTest(){

        StudentA student = new StudentA();


        student.setStudNr("28984938");
        student.setStudName("Jake");
        student.setCourse("NDIP");
        student.setAge(20);
        student.setYear(2018);

Assert.assertEquals("Jake", student.getStudName());

    }
}