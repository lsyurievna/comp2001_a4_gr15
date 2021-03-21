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
    private int id; 
    private String department;
    private HashSet<Course> courses;//use hashset so that course names do not repeated

    /**
     * Constructor for objects of class Student
     */
    public Student(String name, int id, String department)
    {
        name = this.name;
        id = this.id;
        department = this.department;
        courses = new HashSet<>();
    }
    
    /**
     * Accessormethods for all private fields of the class
     */
    
    public String getName(){return this.name;}
    
    public int getID(){return this.id;}
    
    //Since choice of department is optional, return "Major not declared"
    //if the student belongs to no department
    public String getDepartment()
    {
        if (this.department != null)
        {
            return this.department;
        }
        else
        {
            return "Major not declared";
        }
    }
    
   
    public String getCouses()
    {
        return courses.stream()
            .map(c -> c.getCourseTitle()) 
            .reduce("", (acc,element) -> acc + element);
        
    }
    
    
    public void addCourse(Course course)
    {
        courses.add(course);
        //when we do that, a student's name shoud automaticall be added
        //to the course's student list as well
        //how could we do that?...
        //Maybe we should do that in a completely separate class to avoid 
        //code duplication.
    }
    
}
