
/**
 * Write a description of class SupportSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SupportSystem
private void SupportSystem(String code, String year, String term){
		if(!courseExists(code))
        {
			System.out.println("There is no course with this course code.");
			return;
		}

		if(!sectionExists(code, year, term))
        {
			System.out.println("The course does not have this section.");
			return;
		}

		if(!prerequisiteMet(code, year, term))
        {
			System.out.println("Not all prerequisites are fulfilled.");
			return;
		}

		if(!haveNotTakenCourse(code, year, term))
        {
			System.out.println("You have already enrolled this course.");
			return;
		}


			else
            {
				System.out.println("Course with code " + code + " does not exist.");
				statement.close();
				return;
			}

			int numRowsAffected = statement.executeUpdate("INSERT INTO enroll VALUES (" + user + ", '" + code + "', " + year + ", " + term + ", null)");
			statement.close();

			if(numRowsAffected == 0)
				System.out.println("Enrollment failed.");
			else
				System.out.println("Enrollment succeeded.");
		
		}
	}
