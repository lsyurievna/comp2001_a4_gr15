

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class UniversityEnrollmentSystemTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class UniversityEnrollmentSystemTest
{
    
    private Course Math1001;
    private Course COMP2001;
    private Course PHYS1501;
    private UniversityEnrollmentSystem universityEnrollmentSystem;

    /**
     * Default constructor for test class UniversityEnrollmentSystemTest
     */
    public UniversityEnrollmentSystemTest()
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
        
        universityEnrollmentSystem = new UniversityEnrollmentSystem();
        universityEnrollmentSystem.addCourse(COMP2001);
        universityEnrollmentSystem.addCourse(Math1001);
        universityEnrollmentSystem.addCourse(PHYS1501);
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
    public void test_coursesExist()
    {
        assertEquals(true, universityEnrollmentSystem.coursesExist());
    }

    

    @Test
    public void test_getNumberOfCourse()
    {
        assertEquals(3, universityEnrollmentSystem.getNumberOfCourses());
    }

    @Test
    public void test_printCoursesInfo()
    {
        universityEnrollmentSystem.printCoursesInfo();
    }
}




