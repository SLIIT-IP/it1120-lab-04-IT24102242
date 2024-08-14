import java.util.Scanner;
public class IT24102242Lab4Q3
{
	public static void main (String[] args)
	{
		int number;
		String result;
		
		Scanner num=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1=num.nextInt();
		
		result=(num1 > 0)? "The number is: positive":
		       (num1 < 0)? "The number is: Negative":
			                  "The number is: zero";
			   
		System.out.println(result);	   
		

	}
}	