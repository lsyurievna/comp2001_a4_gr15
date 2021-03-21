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
    
    //looks like code repetition though, maybe use inheritance somehow?
    public void addStudent(Student student)
    {
        students.add(student);
    }
    
    public void enrollStudent(Student student, Course course)
    {
        student.addCourse(course);
        //course.addStudent(student);
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
     * Returns true if any courses are offered. Returns false if no courses are offered.
     * @return true or false
     */
    public boolean coursesExist()
    {
        if (courses.size() == 0){return false;}
        else {return true;}
    }
    
    /**
     * Returns the number of courses that is offered by university.
     * @return number of course
     */
    public int getNumberOfCourses()
    {
        return courses.size();
    }
    
    
    
    
}
