import java.util.Scanner;

import java.util.Random;

public class Game1{

	public static void main(String[] args){
	Random random = new Random();
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number, Head is 0  1 is Tail ");

	int num = input.nextInt();
int generatedNumber = random.nextInt(2);
	
	int head = 0;
	int tail = 1;
	
	if(num > 1){
	System.out.print("Invalid Input");
	}
else
	
	
	if(num == generatedNumber && num <=1){
		System.out.printf("Generated Number is %d%n", generatedNumber);
		System.out.print("You Won");
}else{
	
	if(num != generatedNumber && num <=1)
		System.out.printf("Generated Number is %d%n ", generatedNumber);
		System.out.print("You Lose");
	}
}

}