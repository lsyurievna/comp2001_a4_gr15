import java.util.HashSet;

/**
 * Write a description of class Student here.
 *
 * @author Liudmila Strelnikova
 * @version 16.03.2021
 */

public class Student

{
    //would not make any of the instance variables constants, since
    //a student might decide to change all of the info provided
   
    private String name;
    private String id; 
    private String department;
    private HashSet<Course> courses;//use hashset so that course names do not repeated

    /**
     * Constructor for students who have chosen a major. 
     */
    public Student(String name, String id, String department)
    {
        this.name = name;
        this.id = id;
        this.department = department;
        courses = new HashSet<>();
    }
    
    /**
     * Constructor for students who have not chosen a major
     */
    public Student(String name, String id)
    {
        this.name = name;
        this.id = id;
        courses = new HashSet<>();
    }
    
    //Since choice of department is optional, return "Major not declared"
    //if the student belongs to no department
    public String getDepartment()
    {
        if (department != null)
        {
            return department;
        }
        else
        {
            return "Major not declared";
        }
    }
    
    /**
     * Returns a set of courses into which the student is enrolled.
     * @return set of courses
     */
    public HashSet getCourses()
    {
        return courses;
        
    }
    
    
    /**
     * Returns all the information about a student except the department.
     * @return string with student information
     */
    public String getInfo()
    {
        return ("Student's name: " + name + ", ID: " + id + ".");
    }
    
    /**
     * Returns the student's name
     * @return student's name as a string
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Adds a new course to the student's list of courses.
     */
    public void addCourse(Course course)
    {
        courses.add(course);
    }
}

