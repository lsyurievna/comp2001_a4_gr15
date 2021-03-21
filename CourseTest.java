

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
    private Course Math1001;
    private Course COMP2001;
    private Course PHYS1501;

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
        Math1001 = new Course("Jim Bob", "Math", "1001");
        COMP2001 = new Course("Adrian Fiech", "COMP", "2001");
        PHYS1501 = new Course("Michael Rosengbaum", "PHYS", "1501");
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

