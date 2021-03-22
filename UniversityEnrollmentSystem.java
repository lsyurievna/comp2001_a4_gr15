import java.util.HashSet;
/**
 * UniversityEnrollmentSystem class stores the list of all courses in the university.
 * It also stores the list of all Students in the university. From it, we can see information
 * about any course and print info about students from a particular department.
 *
 * @author Liudmila Strelnikova
 * @version 20.03.2021
 */
public class UniversityEnrollmentSystem
{
    private HashSet<Student> students;
    private HashSet<Course> courses;
    
    /**
     * Constructor for objects of class UniversityEnrollmentSystem
     */
    public UniversityEnrollmentSystem()
    {
        students = new HashSet<>();
        courses = new HashSet<>();
    }
    
    /**
     * As new courses are being created and offered, they are added to the system.
     * @param course to be offered
     */
    public void addCourse(Course course)
    {
        courses.add(course);
    }
    
    /**
     * As a students enters university, his name is added to the set of students.
     * @param student who entered university
    */
    public void addStudent(Student student)
    {
        students.add(student);
    }
    
    /**
     * The class prints information about every course in the university.
     */
    public void printCoursesInfo()
    {
        courses.stream()
        .forEach(c -> System.out.println(c.getInfo()));
    }
 

    /**
     * Prints info on students in a given department.
     */
    public void printStudentsInDepartment(String department)
    {
        students.stream()
        .filter(ss -> ss.getDepartment().equals(department))
        .forEach(ss -> System.out.println(ss.getInfo()));
    }

    
    
    
    
}
