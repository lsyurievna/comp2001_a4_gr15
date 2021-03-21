

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StudentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentTest
{
    private Student Mary;
    private Student Akheel;

    /**
     * Default constructor for test class StudentTest
     */
    public StudentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        Mary = new Student("Mary Brown", "20181", "Physics");
        Akheel = new Student("Akheel Raman", "20173");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void test_getDepartment()
    {
        assertEquals("Major not declared", Akheel.getDepartment());
        assertEquals("Physics", Mary.getDepartment());
    }

    @Test
    public void test_getInfo()
    {
        assertEquals("Student's name: Akheel Raman, ID: 20173.", Akheel.getInfo());
        assertEquals("Student's name: Mary Brown, ID: 20181.", Mary.getInfo());
    }
}


