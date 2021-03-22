import java.util.HashMap;

/**
 * This is a university instructor. In this simple version of the program, the 
 * instructor's  role is to assign grades to students in a specific class, 
 * return the map with grades and students (post grades). The map itself is also stored in
 * this class.
 * Assume instructor only teaches one course.
 */
public class Instructor
{
    // instance variables - replace the example below with your own
    private Course course;
    private String name;
    private HashMap<Student, Integer> grades;

    /**
     * Constructor for objects of class Professor
     */
    public Instructor(Course course, String name)
    {
        this.course = course;
        this.name = name;
        grades = new HashMap<>();
    }

    /**
     * Assign grades to all students for one piece of work(assignment or test);
     * @param student student to be evaluated
     * @grade the evaluation of student's work
     */
    private void assignGrade(Student student, Integer grade)
    {
        grades.put(student, grade);
    }
    
    /**
     * Return the map containing the student's grades.
     */
    public HashMap getGrades()
    {
        return grades;
    }
    
    /**
     * Returns the name of the instructor.
     * @return getName
     */
    public String getName()
    {
        return getName();
    }
    
    
    
}
