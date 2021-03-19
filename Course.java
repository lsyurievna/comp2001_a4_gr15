import java.util.HashSet;

/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String instructor;
    private String title;
    private String number;
    private HashSet<Student> students;
    

    /**
     * Constructor for objects of class Course
     */
    public Course(String instructor, String title, String number)
    {
       this.instructor = instructor;
       this.title = title;
       this.number = number;
       students = new HashSet<>();
    }
    
    public String getCourseTitle(){return this.title;}
    
    

}
