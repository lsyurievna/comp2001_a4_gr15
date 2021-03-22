
/**
 * Write a description of class Results here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Results
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Results
     */
    public Results()
    {
        // initialise instance variables
        x = 0;
    }
}
    
    private double gradeToPoint(String Results, int credit){
		double points = 0.0;
		if(Results == null)
			return 0.0;
		if(Results.equals("A"))
			points = 4.0 * credit;
		else if(Results.equals("B"))
			points = 3.0 * credit;
		else if(Results.equals("C"))
			points = 2.0 * credit;
		else if(Results.equals("D"))
			points = credit;
		else if(Results.equals("F"))
			points = 0.0;
		else if(Results.equals("null"))
			points = 0.0;

		return points;
	}
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
