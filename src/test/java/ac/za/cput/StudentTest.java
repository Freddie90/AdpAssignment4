package ac.za.cput;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class StudentTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void StudTest(){

        Student stud = new Student
                .Builder()
                .studNr("215821231")
                .studName("Jake")
                .course("NDIP")
                .age(22)
                .year(2019)
                .build();

        Assert.assertEquals("Jake", stud.getStudName());

    }
}