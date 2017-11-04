/**
 * 
 * @author 
 * @author 
 * 
 */
import java.util.Scanner;

public class Section01 {

	public static void exercise01() {
		boolean a = true; 
		boolean b = false;
		int n1 = 5, n2 = 8;
		if ((!a && b) || !(n1>n2)) System.out.println("Result 1");
		if ((!a || b) || !(n2>n1)) System.out.println("Result 2"); //((The opposite of a) or b) is false and (The opposite of (8 greater than 5)) is also false. Then false or false is finally false
		if ((n1>=n2) && (a || b))  System.out.println("Result 3");//(5 is greater or equal tan 8) is false. The and comparator will only return true if the two values are true
	}

	public static void exercise02() {

		Scanner input = new Scanner (System.in); 
		double weight, height, bmi;
		System.out.print("Insert your weight:"); 
		weight = input.nextDouble(); 
		System.out.print("Insert your height:"); 
		height = input.nextDouble();
		// compute the bmi and print the nutritional condition
		bmi = weight/Math.pow(height, 2);
		System.out.println("Your bmi is: "+bmi);
		if (bmi<16.0) {
			System.out.println("You have probably entered your wrong data. Try again.");
		}
		if (16.0<bmi && bmi<18.5) {
			System.out.println("You suffer from thinness Take care of your food");
		}
		if (18.5<bmi && bmi<24.99) {
			System.out.println("You are in your perfect weight. Keep it up");
		}
		if (25<=bmi && bmi<29.99) {
			System.out.println("You suffer from overweight. Take care of your food");
		}
		if (30<=bmi) {
			
		}
	}

	public static void exercise03() {
		Scanner input = new Scanner (System.in);
		int age, price, discount, finalprice;
		System.out.println("Introduce your age:");
		age = input.nextInt();
		System.out.println("Introduce your purchase:");
		price = input.nextInt();
		if (age>65) {
			discount = (price*10)/100;
			finalprice = price - discount;
			System.out.println("Your final price is: "+finalprice);
		}else {
			discount = (price*5)/100;
			finalprice = price - discount;
			System.out.println("Your final price is: "+finalprice);
		}
	}

	public static void exercise04() {
		Scanner input = new Scanner (System.in);
		int num1, num2;
		System.out.println("Introduce a number:");
		num1 = input.nextInt();
		System.out.println("Introduce another number:");
		num2 = input.nextInt();
		if (num1>num2) {
			System.out.println("The number 1 is bigger than the second.");
		}if (num1>num2) { 
			System.out.println("The number 2 is bigger than the first one.");
		}if (num1==num2) { 
			System.out.println("The two numbers are the same");
		}
	}

	public static void exercise05() {
		int gradefor;
		String gradehere;
		gradehere=null;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce your foreign grade:");
		gradefor = input.nextInt();
		if (gradefor==20) {
			gradehere="A";
		}
		if (gradefor==19 || gradefor==18) {
			gradehere="B";
		}
		if (gradefor==17 || gradefor==16) {
			gradehere="C";
		}
		if (gradefor==15 || gradefor==14) {
			gradehere="D";
		}
		if (gradefor<14) {
			gradehere="E";
		}
		System.out.println("Your grade is "+gradehere);
	}

	public static void exercise06() {
		int gradefor;
		String gradehere;
		gradehere=null;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce your foreign grade:");
		gradefor = input.nextInt();
		switch(gradefor) {
		case 20: System.out.println("Your grade is A");
					break;
		case 19: 
			
		case 18: System.out.println("Your grade is B");
		break;
			
		case 17: 
		
		case 16: System.out.println("Your grade is C");
		break;
			
		case 15: 
			
		case 14: System.out.println("Your grade is D");
		break;
			
		case 13:
			
		case 12: 
			
		case 11: 
			
		case 10: 
			
		case 9: 
			
		case 8: 
			
		case 7: 
			
		case 6:
			
		case 5:
			
		case 4: 
			
		case 3: 
			
		case 2: 
			
		case 1: System.out.println("Your grade is E");
		break;	
		}
	}

	public static void exercise07() {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce number:");
		int numero = input.nextInt();
		int remainder=numero%2;
		String type= null;
		if (remainder==0) {
			type="even";
		}else {
			type = "odd";
		}
		System.out.println("Your number is "+ type);
	}

	public static void exercise08() {
		int coor1, coor2, coorin1, coorin2,coorin3, coorin4, distance1, distance2,distance1b, distance2b;
		coor1=0;
		coor2=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce the first coordinate:");
		coorin1 = input.nextInt();
		System.out.println("Introduce the second coordinate:");
		coorin2 = input.nextInt();
		System.out.println("Introduce the first coordinate of the point number 2:");
		coorin3 = input.nextInt();
		System.out.println("Introduce the second coordinate of the point number 2:");
		coorin4 = input.nextInt();
		distance1 = coor1-coorin1;
		distance1b = coor2-coorin2;
		distance2 = coor1-coorin3;
		distance2b = coor2-coorin4;
		double distance11b = Math.sqrt(Math.pow(distance1,2)+Math.pow(distance1b,2));
		double distance22b = Math.sqrt(Math.pow(distance2,2) + Math.pow(distance2b, 2));
		double power1 = Math.pow(distance1, 2);
		double power2 = Math.pow(distance2, 2);
		double power1b = Math.pow(distance1b, 2);
		double power2b = Math.pow(distance2b, 2);
		System.out.println("Distance 1-2 is: " + distance11b);
		System.out.println("Distance 1-3 is: " + distance22b);
		/*
		System.out.println(distance1);System.out.println(distance1b);System.out.println(distance2);System.out.println(distance2b);
		System.out.println(power1);
		System.out.println(power1b);    
		System.out.println(power2);
		System.out.println(power2b);
		*/
	}

	public static void exercise09() {
		int result=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce number:");
		int number = input.nextInt();
		System.out.println("Introduce another number:");
		int anothernumber = input.nextInt();
		System.out.println("What would you like to do? Sum (s) or Substract (r)");
		String decision = input.next();
		if (decision.equalsIgnoreCase("s")) {
			result = number + anothernumber;
		}if (decision.equalsIgnoreCase("r")){
			result=number-anothernumber;
		}else {
			System.out.println("Error, try again");
		}
		System.out.println("El resultado de la operación seleccionada es" + result);
	}

	public static void exercise10() {
		int num1pos = 0;
		int num2pos = 0;
		int num3pos = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce number:");
		int num1 = input.nextInt();
		System.out.println("Introduce another number:");
		int num2 = input.nextInt();
		System.out.println("Introduce another number:");
		int num3 = input.nextInt();
		if (num1>num2&&num1>num3&&num2>num3) {
			System.out.println(num1+" "+ num2+" "+ num3);
		}
		if (num1>num2&&num1>num3&&num3>num2) {
			System.out.println(num1+" "+ num3+" "+ num2);
		}
		if (num2>num1&&num2>num3&&num1>num3) {
			System.out.println(num2+" "+ num1+" "+ num3);
		}
		if (num2>num1&&num2>num3&&num3>num1) {
			System.out.println(num2+" "+ num3+" "+ num1);
		}
		if (num3>num1&&num3>num2&&num2>num1) {
			System.out.println(num3+" "+ num2+" "+ num1);
		}
		if (num3>num1&&num3>num2&&num1>num2) {
			System.out.println(num3+" "+ num1+" "+ num2);
		}
	}

	public static void main(String[] args) {
		
		exercise01();
		exercise02();
		exercise03();
		exercise04();
		exercise05();
		exercise06();
		exercise07();
		exercise08();
        exercise09();
		exercise10();
	}

}
