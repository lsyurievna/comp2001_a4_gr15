

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CourseTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CourseTest
{
    private Instructor AdrianFiech;
    private Course COMP2001;

    /**
     * Default constructor for test class CourseTest
     */
    public CourseTest()
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
        AdrianFiech = new Instructor("Adrian Fiech");
        COMP2001 = new Course(AdrianFiech, "COMP", "2001");
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
    public void test_getInfo()
    {
        assertEquals("Course name: COMP, course ID: 2001, instructor: Adrian Fiech.", COMP2001.getInfo());
    }
}


