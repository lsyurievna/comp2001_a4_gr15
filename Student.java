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
    private String id;//ID is a number but it is not used in calculations, so it is more convinient to store it as a String
    private String department;
    private HashSet<Course> courses;//use hashset so that course names do not repeated

    /**
     * Constructor for objects of class Student
     */
    public Student(String name, String id, String department)
    {
        name = this.name;
        id = this.id;
        department = this.department;
        courses = new HashSet<>();
    }
    
    /**
     * Accessormethods for all private fields of the class
     */
    
    public String getName(){return name;}
    
    public String getID(){return id;}
    
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
    
    //Gives an error now since getCouseName method is not yet implemented
    //in the Course class.
    /**
    public String getCouses()
    {
        return courses.stream()
            .filter(c -> c.getCourseName()) 
            .reduce("", (acc,element) -> acc + element);
        
    }
    */
    
    
}
