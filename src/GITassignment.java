import java.util.*;
public class GITassignment {

		public static void main(String[] args) {
			
			        // Create a Scanner object For Input Data

					Scanner no = new Scanner(System.in);  
					
					System.out.println("Enter Index No = ");
					int ino = Integer.parseInt(no.nextLine());  
					
					System.out.println("Enter Name = ");
					String name = no.nextLine();  
					
					System.out.println("Enter Assignment Marks = ");
					int aMarks = Integer.parseInt(no.nextLine());
					
					
					// Create Object use Grading Class 		
					Grading grading = new Grading();
					
					// Assign Marks For variable of Grading Class 
					grading.marks = aMarks;
					
					
					
					// Get Grade Value From Grading Class			
					String sGrade = grading.grade();
					
					
					// Output Student Personal Data , Average Marks And Grade 
					System.out.println("Index No = " + ino) ;
					System.out.println("Name = " + name);
					System.out.println("Average Marks = " +  aMarks );
					System.out.println("Grade = " + sGrade);
					
		}

}
