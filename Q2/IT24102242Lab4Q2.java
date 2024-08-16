import java.util.Scanner;

public class IT24102242Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.print("Please enter exam marks (out of 100): ");
        double exammarks = input.nextDouble();
        if (exammarks > 100 || exammarks < 0) {
            System.out.println("Invalid input for exam marks. Terminating program.");
			return;
        }
		System.out.print("Please enter lab marks (out of 100): ");
        double labmarks = input.nextDouble();
        if (labmarks > 100 || labmarks < 0) {
            System.out.println("Invalid input for lab marks. Terminating program.");
			return;
        }
		System.out.print("Please enter the percentage given for the exam: ");
        double exampercentage = input.nextDouble();
        if (exampercentage > 100 || exampercentage < 0) {
            System.out.println("Invalid input for exam percentage. Terminating program.");
            return;
        }
		System.out.print("Please enter the percentage given for the Lab Submission: ");
        double labpercentage = input.nextDouble();
        if (labpercentage > 100 || labpercentage < 0) {
            System.out.println("Invalid input for lab percentage. Terminating program.");
            return;
        }
		double percentage = exampercentage + labpercentage;
        if (percentage != 100) {
            System.out.println("The total percentage must add up to 100. Terminating program.");
            return;
        }
		double finalmarks = (exammarks * exampercentage / 100) + (labmarks * labpercentage / 100);
        System.out.println("Final exam mark is: " + finalmarks);
		percentage=exampercentage + labpercentage;
				if (percentage !=100)
				{
					System.out.println("The percentage must add up to 100.Terminating program: ");
					return;
					}
		
					
	}
}

					
				 
				
				
				
				
				
				
				
				
			
			
		
	         
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
