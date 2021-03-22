import java.util.HashSet;

/**
 * A student class contains the student's name, id, and department if a student has 
 * chosen a major. It also contains a set of courses into which the student is enrolled in.
 * 
 *
 * @author Liudmila Strelnikova
 * @version 22.03.2021
 */

public class Student

{
    private String name;
    private String id; 
    private String department;
    private HashSet<Course> courses;

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
    
    
    /**
     * Returns the student's department. Since choice of department is optional,
     * return "Major not declared" if the student belongs to no department
     * @return department in which the student is studying.
     */
    
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
     * Returns the student's name
     * @return student's name as a string
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Returns all the information about a student except the department.
     * @return string with student information
     */
    public String getInfo()
    {
        return ("Student's name: " + name + ", ID: " + id + ".");
    }
    
}

