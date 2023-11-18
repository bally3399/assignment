import java.util.Scanner;

public class Perimeter{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number");

	int num1 = input.nextInt();

	System.out.print("Enter second number");

	int num2 = input.nextInt();

	System.out.print("Enter third number");

	int num3 = input.nextInt();




		int sum = 0;

		if(num1 + num2 < num3)
			System.out.println("Invalid input");
		if (num1 + num2 > num3)
			System.out.println("Valid input");
			sum = num1+num2+num3;
			System.out.printf("The perimeter is %d", sum);
	
}
}