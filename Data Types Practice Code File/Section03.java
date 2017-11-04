/**
 * 
 * @author 
 * @author 
 * 
 */
import java.util.Random;
public class Section03 {
	
	public static void exercise01() {
		double number = 121;
		double squareroot = Math.sqrt(number);
		System.out.printf("The square root of %.1f is %.1f%n", number, squareroot);

	}
	

	
	public static void exercise02() {
		int number = 2;
		int power = 10;
		int exp = (int) Math.pow(number, power);
		System.out.println(exp);

	}
		

	
	public static void exercise03() {
		boolean solution = false;
		int x;
		
		while (solution == false) {
			x = (int) (Math.random()*10);
			if (x>=5 && x<10) {
				System.out.println(x);
				solution = true;
			}else {
				solution = false;
			
			}
		}
			

	}
	
	
	
	public static void exercise04() {
		double radius;
		double circumference;		
		radius = 10;
		//Your code here
		circumference= 2.0 * Math.PI * radius;
		System.out.println("The circumference of a circle with radius " + radius + " is " + circumference);

	}
	
	
	
	public static void exercise05() {
		double a=-1;
		double b=10;
		double c=-21;
		double x1,x2;
		//Calculate x1 y x2
		x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
	    x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
		System.out.print("The equation is: ");
		System.out.println(a + "x2 + " + b + "x + " + c + " = 0");
		System.out.println("Las solutions are x1 = " + x1+" x2 = "+x2);

	}

	

	public static void exercise06() {
		double base = 3;
		double x = 81;
		double logarithm;
		//your code here
		logarithm = Math.log10(x)/Math.log10(base);
		System.out.println("The logarithm base "+ base + " of "+ x + " is "+ logarithm );
		
	}
	
	
	
	public static void exercise07() {
		double angle = 30;
		double hip = 100;
		double ladoopuesto;
		double oneradian = 57.2958;
		double x;
		x = angle/oneradian;
		ladoopuesto = Math.cos(x)*hip;
		System.out.println(ladoopuesto);

	}
	


	public static void main(String[] args) {
		exercise01();
		exercise02();
		exercise03();
		exercise04();
		exercise05();
		exercise06();
		exercise07();
	}

}
