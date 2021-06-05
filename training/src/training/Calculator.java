package training;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Arthemetic Calculation!!");
		System.out.println("The length of arguments: "+ args.length);// size of an array
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("The arguments passed are: "+a+" "+b);
		System.out.println("Addition is: "+ (a + b));
		System.out.println("Subtraction is: " + (a - b));
		System.out.println("Multiplication is: "+(a * b));
		System.out.println("Division is: "+(a / b));
		
	}
}
