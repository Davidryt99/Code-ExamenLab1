/**
 * 
 * @author 
 * @author 
 * 
 */
import java.util.Scanner;

public class Section02 {

	public static void exercise01() {
		Scanner input = new Scanner(System.in);
		int num = 0;
		int suma = 0;
		while (num != -1) {
		System.out.println("Insert a number: ");
		num = input.nextInt();
		suma = num + suma;
		
	}
		System.out.println("La suma total es: " + suma);
	}

	public static void exercise02() {
		Scanner input = new Scanner(System.in);
		System.out.println("Insert a number: ");
		int num1 = input.nextInt();
		System.out.println("Insert a greater number: ");
		int num2 = input.nextInt();
		int count = num1;
		while (count<(num2-1)) {
			System.out.print(++count + "  ");
			System.out.println("");
		}
	}

	public static void exercise03() {
		Scanner input = new Scanner(System.in);
		System.out.println("Insert a number: ");
		int num1 = input.nextInt();
		int suma=0;
		for (int i = 1; i<num1; i++){
			int div = num1%i;
			if (div == 0) {
				suma = suma+i;
			
		}else{}
		}
		System.out.println("The sum of the divisors is: " + suma);
		if(suma == num1) {
			System.out.println("The number entered is perfect");	
		}else {
			System.out.println("The number entered is not perfect");	
		}
	}

	public static void main(String[] args) {
		exercise01();
		exercise02();
		exercise03();
	}

}
