/**
 * 
 * @author 
 * @author 
 * 
 */
public class Section04 {

	
	public static void exercise01() {
		byte varByte;
		short varShort;
		int varInt;
		long varLong;
		float varFloat;
		double varDouble;
				  
		varByte = 20;
		varShort = 2000 ;
		varInt = 2000000 ;
		varLong = 85000000L ;
		varFloat = 10.0E4F ;
		varDouble = 0.123456789e9;
		//make the necessary casts
		varInt    = varShort;// Does not need conversion.
		varDouble = varFloat;  // Does not need conversion.
		varFloat  = varLong; // Does not need conversion.
		varLong   = varInt; // Does not need conversion.
		varByte   = (byte)varShort; // Need a conversion because the value is very high
		varShort  = (short) varInt; // Need a conversion because the value is very high
		
	}
	

	
	public static void exercise02() {
		long varLong;
		int varInt;
		short varShort;
		byte varByte;
		
		varInt = 33000;
		varLong = varInt;
		varShort = (short)varInt;
		varByte = (byte)varInt;
		System.out.println(varInt); //initial value
		System.out.println(varLong);// value doesn't changes becouse narrowing conversion isn't needed
		System.out.println(varShort);// Changing an integer of 64 bits to 16bits produces this change
		System.out.println(varByte);//Again, the narrowing conversion produce this change in the result
		
	}
	

	
	public static void exercise03() {
		double varDouble;
		float varFloat;
		long varLong;
		int varInt;
		short varShort;
		byte varByte;
		varFloat = 33000.51f; // The value 33000.51f
		varDouble = varFloat; // Does not need conversion obtaining 33000.51171875
		varLong =(long)varFloat;// The format number-f could not be stored in long so we converted it obtaining 33000
		varInt =(int)varFloat; // The format number-f could not be stored in int so we converted it obtaining 33000
		varShort=(short)varFloat; // The format number-f could not be stored in short so we converted it, and i'ts so big obtaining -32536
		varByte=(byte)varFloat; // The format number-f could not be stored in byte so we converted it, and i'ts so big obtaining -24
		System.out.println(varFloat);// We print all the values
		System.out.println(varDouble); 
		System.out.println(varLong);
		System.out.println(varInt);
		System.out.println(varShort);
		System.out.println(varByte);
		
	}
	
	
	
	public static void exercise04() {
		double bigD, normalD, smallD;
		float  bigF, normalF, smallF;
		bigD = 2.87e300;
		normalD  = 20.123456789;
		smallD  = 0.1E-200;
				
		bigF = (float)bigD;// in the next three lines we need to do the narrowing conversions from double to float. If the number is higher than the capacity, it will return Infinite, and if it's smaller, 0.
		normalF  = (float)normalD;
		smallF  = (float)smallD;
					
		System.out.println("Big Double : " + bigD); 
		System.out.println("Big Float: " + bigF);    
		System.out.println("Normal Double: " + normalD);
		System.out.println("Normal Float: " + normalF);
		System.out.println("Small Double: " + smallD);
		System.out.println("Small Float: " + smallF);
		byte b1 =  (byte)128;// The maximun value of byte is 2^7-1, then appears -128
		byte b2 =  127;
		byte b3 =  127;
		b3++;// The same happens here, when we ad to b3 (127) 1 more, obtaining again a higher value than byte can store
		short s1 = (short)-32769;//Here hapens the same but in 16 bits, with a maximun value of 2^15-1.
		short s2 = -32768;
		short s3 = -32768;
		s3--;// The same happens here, when we ad to s3 (-32768) 1 more, obtaining again a higher value than short can store
		System.out.println("Byte  1 : " + b1);    
		System.out.println("Byte  2 : " + b2);    
		System.out.println("Byte  3 : " + b3);
		System.out.println("Short 1 : " + s1);
		System.out.println("Short 2 : " + s2); 		
		System.out.println("Short 3 : " + s3); 
	}
	

	public static void main(String[] args) {
		exercise01();
		exercise02();
		exercise03();
		exercise04();

	}

}
