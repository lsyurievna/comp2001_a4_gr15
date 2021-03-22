import java.util.HashSet;
/**
 * The support system should enroll a student in a specific course. 
 * Can make this class abstract and call it from the UniversityEnrollmentSystem.
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
     */
    //Not a very good way of doing it but I can't come up with a better solution.
    public void enroll(Student student, Course course)
    {
        student.getCourses().add(course);
        course.getStudents().add(student);
        
    }
    
    /**
     * Shows grades to the student for a particular course.
     */
    public void showGradesForCourse(Student student, Course course)
    {
        Instructor instructor = course.getInstructor();
        
    }
}
