/**
 * 
 * @author 
 * @author 
 * 
 */
import java.util.Scanner;

public class Section03 {

	public static void exercise01() {
		int option = 1;
		Scanner input = new Scanner(System.in);
		do {
		System.out.println("1- Option 1\r\n" + 
				"2- Option 2\r\n" + 
				"0- Exit\r\n" + 
				"Select an option: ");
		option = input.nextInt();
		}while(option != 0);
	}

	public static void exercise02() {
		int num = (int) (Math.random()*100), in, attempts = 0;
		int base = 0;
		int top = 100;
		System.out.println("Introduce a number between " + base + " and "+top );
		Scanner input = new Scanner(System.in);
		in = input.nextInt();
		do {
			if (num != in && in<num){
				attempts += 1; 
				base = in;
				System.out.println("Introduce a number between "+ base +" and "+ top); 
				in = input.nextInt();}
			if (num != in && in>num){
				attempts += 1; 
				top = in;
				System.out.println("Introduce a number between "+ base +" and "+ top); 
				in = input.nextInt();}
		}while(in != num); 
			attempts += 1;
			System.out.println("Correct! You needed "+attempts+ " attempts");}
			
		
	

	public static void exercise03() {
		int num, options = 0, factorial = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce a number :");
		num = input.nextInt();
		if (num<0){
			System.out.println("Please introduce a positive number");
			}
		if (num == 0){
			System.out.println("Please introduce a number different from 0");
			}
		do{
			System.out.println("What do you want to do: \n"
				+ "1--Compute the factorial of the number \n"
				+ "2--Count the number of digits  \n"
				+ "3--Exit ");
		options = input.nextInt();
		if (options == 1){
			for(int i = 1; i<=num; i++)
				factorial = factorial*i;
				System.out.println ("The factorial of "+num+ " is "+factorial +"\n");}
		if (options == 2){
			int length = (int)(Math.log10(num)+1); 
			System.out.println(num+" has "+length+" digits");}
		}while(options !=3);
		System.out.println("Shutting down...");
	}
	

	

	
	public static void main(String[] args) {
		exercise01();
		exercise02();
		exercise03();
		
	}

}
