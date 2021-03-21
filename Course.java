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
    private String instructor;
    private String title;
    private String number;
    private HashSet<Student> students;
    private HashMap<Integer,ArrayList<Integer>> grades;
    //I suggest hashmap for the grades with student ID as a "key"
    //and ArrayList of marks of type integer as a "value"

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
    
    public void addStudent(Student student)
    {
        students.add(student);
    }
    
    public void assignGrade(Student student, int grade)
    {
        //grades.add(student.getID(), 
    }
    
    

}
