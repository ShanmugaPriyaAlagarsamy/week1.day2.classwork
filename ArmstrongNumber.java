package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 371;
		int rem;
		int calculated;
		int sum =0;
		int original;
		original = input;
		
		while(input > 0) {
			
			rem = input%10;
			calculated = rem*rem*rem;
			sum = sum+calculated;
			input = input/10;
			
		}
		
		if(original == sum)
		{
			System.out.println("The number is Armstrong Number");
			
		}
		
		else
		{
			System.out.println("The number is not Armstrong number");
			
		}
		
		
			

	}

}
