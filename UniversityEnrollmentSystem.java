import java.util.HashSet;
/**
 * Here is where all the lists should be stored I think. And main methods implemented. 
 *
 * @author Liudmila Strelnikova
 * @version 20.03.2021
 */
public class UniversityEnrollmentSystem
{
    private HashSet<Student> students;
    private HashSet<Course> courses;
    
    /**
     * Constructor for objects of class UniversityEnrollmentSystem
     */
    public UniversityEnrollmentSystem()
    {
        students = new HashSet<>();
        courses = new HashSet<>();
    }

    public void addCourse(Course course)
    {
        courses.add(course);
    }
    
    //looks like code repetition though, maybe use inheritance somehow?
    public void addStudent(Student student)
    {
        students.add(student);
    }
    
    public void enrolStudent(Student student, Course course)
    {
        student.addCourse(course);
        course.addStudent(student);
    }
    
    //for marks assignment I think we should use a HashMap with 
    //student id as a key, and ArrayList with marks as a value
    
}
