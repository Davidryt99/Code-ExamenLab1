/**
 * 
 * @author 
 * @author 
 * 
 */
import java.util.Scanner;

public class Section01 {

	public static void exercise01() {
		for(int i=1; i<6; i++){  
		int x;
	      System.out.println("Enter an integer to check if it is odd or even ");
	      Scanner in = new Scanner(System.in);
	      x = in.nextInt();
	 
	      if ( x % 2 == 0 ) {
	         System.out.println("You entered an even number.");
	      }else {
	         System.out.println("You entered an odd number.");
	   }
		}
	}
	

	public static void exercise02(){
		Scanner input = new Scanner(System.in);
		System.out.println("Insert a number: ");
		int CONST = input.nextInt();
		for(int i=1; i<11; i++){
			int multi = CONST * i;
            System.out.println(CONST +" x " + i + " = " + multi);
       }
		
	}

	public static void exercise03() {
		Scanner input = new Scanner(System.in);
		System.out.println("Insert a sentence: ");
		String text = input.nextLine();
		char CONST = 'x';
		for (int i = 0; i<text.length(); i++){
			text = text.replace('a', CONST);
			text = text.replace('e', CONST);
			text = text.replace('i', CONST);
			text = text.replace('o', CONST);
			text = text.replace('u', CONST);
			
		}
		System.out.println(text);
	}

	public static void exercise04() {
		Scanner input = new Scanner(System.in);
		System.out.println("Insert a number: ");
		int a = input.nextInt();
		int f0 = 0;
		int f1 = 1;
		int fn = 0;
		System.out.print(f0+" "+f1+" ");
		for (int i = 2; i<=a; i++){
			fn = f0+f1;
			f0 = f1;
			f1 = fn;
			System.out.print(fn+" ");
			
		}
	}

	
	public static void main(String[] args) {
		exercise01();
		exercise02();
		exercise03();
		exercise04();
	}

}
