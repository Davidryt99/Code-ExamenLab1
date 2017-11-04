/**
 * 
 * @author 
 * @author 
 * 
 */
public class Section02 {

	
	public static void exercise01() {
		final int CONST=53;
		int op1;
		int op2;
		int op3;
		int quotientDiv;
		int remainderDiv;
		//initialize op1 with 1
		op1 = 1;
		// initialize op2 with 5
		op2 = 5;
		//sum 8 to op1
		op1 += 8;
		//subtract 10 to op2
		op2 -= 10;
		//calculate op1 times op2 and store the result in op3
		op3 = op1 * op2;
		//sum CONST to op3
		op3 += CONST;
		//Find the quotient of op3 over 3 and store it in quotientDiv
		quotientDiv = op3/3;
		//Find the remainder of op3 over 3 and store it in remainderDiv
		remainderDiv = op3%3;
		//Print to screen the values of op1, op2, op3, quotientDiv, remainderDiv in separate lines 
		System.out.println( op1);
		System.out.println(op2);
		System.out.println(op3);
		System.out.println(quotientDiv);
		System.out.println(remainderDiv);

	}
	
	
	
	public static void exercise02() {
		int varInt1 = 10;
		int varInt2 = 10;
		int varInt3 = 10;
		int res1 = 5-7*10+ varInt1  ;
		int res2 = 5-7*10+ varInt2++;
		int res3 = 5-7*10+ ++varInt3;
		
		System.out.println("Result 1: " + res1); //This is the result of the mathematic operation 5-(7*10)+10=-55
		System.out.println("Result 2: " + res2); //Here we get the same result because "++" after a variable changes the value of the variable after doing the operation.
		System.out.println("Result 3: " + res3); ////This is the result of the mathematic operation 5-(7*10)+(10+1)=-55. Changes the value of the variable before doing the operation
				
		System.out.println("varInt1: " + varInt1);// The value of the variable hasn't changed
		System.out.println("varInt2: " + varInt2);// The value, as I explained before, is the same plus one
		System.out.println("varInt3: " + varInt3);// The value, as I explained before, is the same plus one

	}
	
	
	
	public static void exercise03() {
		int varInt;
		varInt  = 0;//varInt is declared as 0
		varInt += 5;//varInt is now 0+5=5
		varInt -= 2;//varInt is now 5-2=3
		varInt *= 3;//varInt is now 3*3=9
		varInt /= 2;//varInt is now 9/2=4 and remains 1
		System.out.println(varInt);
		
	}
	
	
	
	public static void exercise04() {
		int age;//age of the customer
		int reports; //accidents reports
		boolean novice; //novice driver
		boolean discount;
		age = 30;
		reports = 3;
		novice = false;
		
		//initialize age, fraction and novice for testing 
		 if ( age>28  &&  age<40 && reports<=2) {
			 discount= true;
	        }else if ( age>18  &&  age<28 && reports<=1 && novice==true) {
	        	 discount= true;
	            }else if ( age>=40  &&  age<60 && reports<=4) {
	        	discount= true;
	        }else {
	            discount = false;
	        }
		//discount= boolean expression
		System.out.println("Discount= "+discount);
										 
	}
    
	
	public static void exercise05() {
		int bill50, bill20, bill10;
		int eurosToWithdraw=130;
		//Your code here
		bill50 = eurosToWithdraw/50;
		int rest = eurosToWithdraw%50;
		bill20 = rest/20;
		rest = rest%20;
		bill10 = rest/10;
		System.out.println(	bill50+" 50 euros banknote ");
		System.out.println(	bill20+" 20 euros banknote ");
		System.out.println( bill10+" 10 euros banknote ");

	}
	 
	
	
	public static void exercise06() {
		double kelvin, fahrenheit;
		//Initialize kelvin for testing
		kelvin = 293.15;
		//Your code here
		fahrenheit = kelvin - 225.15;
		System.out.println("Kelvin :     "+kelvin+"K");
		System.out.println("Farenheit : "+fahrenheit+"ºF ");
	}


	public static void main(String[] args) {
		exercise01();
		exercise02();
		exercise03();
		exercise04();
		exercise05();
		exercise06();			
	}

}
