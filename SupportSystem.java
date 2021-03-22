import java.util.HashSet;
import java.util.HashMap;

/**
 * The support system should enroll a student in a specific course. 
 * 
 */
public class SupportSystem
{

    /**
     * Constructor for objects of class SupportSystem
     */
    
    public SupportSystem()
    {
        
    }

    /**
     * Enrolls a student who contacted the support system into a given course.
     * @param course the student wishes to be enrolled into 
     * @param student who requires assistance
     */
    //Not a very good way of doing it but I can't come up with a better solution.
    public void enroll(Student student, Course course)
    {
        student.getCourses().add(course);
        course.getStudents().add(student);
    }
    
    /**
     * Shows grades to the particular student for a particular course.
     * 
     */
    public void showGradesForCourse(Student student, Course course)
    {
        //iterate over the map until student key is found
        //the value for the key is an array
        //iterate over the array and print all the values in one string
    }
}
