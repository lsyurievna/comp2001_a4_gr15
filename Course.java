import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
    // instance variables - replace the example below with your own
    private Instructor instructor;
    private String title;
    private String number;
    private HashSet<Student> students;
    //I suggest hashmap for the grades with student ID as a "key"
    //and ArrayList of marks of type integer as a "value"

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
    
    public HashSet getStudents()
    {
        return students;
    }
    

    /**
     * Prints info about the course.
     */
    public String getInfo()
    {
        return ("Course name: " + title + ", course ID: " + number + ", instructor: " + instructor.getName() + ".");
    }
    
    /**
     * Returns the instructor who teaches the course
     * @return instructor of the course
     */
    public Instructor getInstructor()
    {
        return instructor;
    }
    

}
