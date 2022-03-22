package week1.day2;

public class MyOldCalculator {

	public int add(int a, int b)
	{
		int sum = a+b;
		return sum;
	}
	public int sub(int a, int b)
	{
		int sub = a-b;
		return sub;
	}
	public double mul(double a, double b)
	{
		double mul = a*b;
		return mul;
	}
	public double div(double a, double b)
	{
		double div = a/b;
		return div;
	}
	public String clear()
	{
		return "cleared";
	}
	public static void main(String args[])
	{
		MyOldCalculator myCalc = new MyOldCalculator();

		System.out.println(myCalc.add(10, 5));
		System.out.println(myCalc.sub(10, 5));
		System.out.println(myCalc.mul(5, 10));
		System.out.println(myCalc.div(10, 5));
		System.out.println(myCalc.clear());
	}






}
