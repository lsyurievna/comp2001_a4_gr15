import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * This class represents a university course. The university course stores a list of students
 * enrolled in the course, instructor's name, the course's title and id.
 *
 * @author Liudmila Strelnikova
 * @version 22.03.2021
 */
public class Course
{
    
    private Instructor instructor;
    private String title;
    private String number;
    private HashSet<Student> students;
    

    /**
     * Constructor for objects of class Course
     */
    public Course(Instructor instructor, String title, String number)
    {
       this.instructor = instructor;
       this.title = title;
       this.number = number;
       students = new HashSet<>();
    }
    
    /**
     * Returns the class list for the course.
     * @return students list of students enrolled in the course
     */
    public HashSet getStudents()
    {
        return students;
    }
    

    /**
     * Returns the instructor who teaches the course
     * @return instructor of the course
     */
    public Instructor getInstructor()
    {
        return instructor;
    }
    
    /**
     * Prints info about the course.
     */
    public String getInfo()
    {
        return ("Course name: " + title + ", course ID: " + number + ", instructor: " + instructor.getName() + ".");
    }
    

}
