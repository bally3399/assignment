import java.util.Scanner;

public class Game{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int firstNumber = scanner.nextInt();

		System.out.println("Enter second number");
		int secondNumber = scanner.nextInt();
		
		System.out.println("Enter third number");
		int thirdNumber = scanner.nextInt();

		int largestNumber = 0;
		int secondLargest = 0;
		int smallestNumber = 0;

		if(secondNumber > firstNumber && thirdNumber < secondNumber){
			largestNumber = secondNumber;
		}
		if(firstNumber > secondNumber && firstNumber > thirdNumber){
			largestNumber = firstNumber;
		}
		
		if(thirdNumber > firstNumber && thirdNumber > secondNumber){
			 largestNumber = thirdNumber;
		}
		if(firstNumber < secondNumber && firstNumber < thirdNumber){
			smallestNumber = firstNumber;
		}
		if(secondNumber < firstNumber && secondNumber < thirdNumber){
			smallestNumber = secondNumber;
		}
		if(thirdNumber < firstNumber && thirdNumber < secondNumber){
			smallestNumber = thirdNumber;
		}

		if(firstNumber < largestNumber && firstNumber > smallestNumber)
			secondLargest = firstNumber;
		if(secondNumber < largestNumber && secondNumber > smallestNumber)
			secondLargest = secondNumber;
		if(thirdNumber < largestNumber && thirdNumber > smallestNumber)
			secondLargest = thirdNumber;

		System.out.printf("Largest is %d, second largest is %d and smallest is %d", largestNumber, secondLargest, smallestNumber);

	}

}