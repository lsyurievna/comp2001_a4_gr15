import java.util.HashMap;
import java.util.ArrayList;

/**
 * This is a university instructor. In this simple version of the program, the 
 * instructor's  role is to assign grades to students in a specific class, 
 * return the map with grades and students (post grades). The map itself is also stored in
 * this class.
 * 
 */
public class Instructor
{
    
    
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<Student, ArrayList> gradeMap;

    /**
     * Constructor for objects of class Professor
     */
    public Instructor(String name)
    {
        
        this.name = name;
        gradeMap = new HashMap<>();
        grades = new ArrayList<>();
    }

    /**
     * Assign grades to all students for one piece of work(assignment or test);
     * @param student student to be evaluated
     * @grade the evaluation of student's work
     */
    private void assignGrade(Student student, Integer grade)
    {
        
        grades.add(grade);
        gradeMap.put(student,grades);
        
    }
    
    /**
     * Return the map containing the student's grades.
     */
    public HashMap getGradeMap()
    {
        return gradeMap;
    }
    
    /**
     * Returns the name of the instructor.
     * @return getName
     */
    public String getName()
    {
        return name;
    }
    
    
    
}
