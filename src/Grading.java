
public class Grading {

	
		// Create Variable for Student_Grade Class 
		public int marks;
		String gradingValue; 
		
		Grading()
		{
			marks = 0 ;
			gradingValue = "";
		}
				
		
		
		public static void main(String[] args) 
		{	
		
		}
			// Select Grading
			String grade()
			{
				if (75 <= marks && marks <= 100 )
				{
					gradingValue = "A";
				}
				else if (50 <= marks && marks <= 74 )
				{
					gradingValue = "B";
				}
				else if (25 <= marks && marks <= 49 )
				{
					gradingValue = "C";
				}
				else if (0 <= marks && marks <= 24 )
				{
					gradingValue = "S";
				}
				
				else
				{
					gradingValue = "Invalid Marks";
				}
				
				return gradingValue;
			
			
			
		}

	
}
