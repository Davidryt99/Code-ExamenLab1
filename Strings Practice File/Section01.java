/**
 * 
 * 
 * @author 
 * @author 
 * 
 */
public class Section01 {

	public static void exercise01(){
		String string0 = " ";
		String string1 = "";
		String cadena0;
		String cadena1;
		if (string0.isEmpty()) {
		cadena0 = "empty";
		
		}else {
			
			cadena0 = "not empty";
		}
		if (string1.isEmpty()) {
			cadena1 = "empty";
			
		}else{
			cadena1 = "not empty";
		}
		System.out.println("String 0 is: " + cadena0 + ".");
		System.out.println("String 1 is: " + cadena1 + ".");
		
	}

	public static void exercise02(){

		//Convert primitive data types to String
		int anInteger = 5;
		String strInt = "2";
		String strInt0 = Integer.toString(anInteger);
		String strInt1 = String.valueOf(anInteger); 
		String strInt2 = ""+ anInteger;	
		System.out.println(strInt0);
		System.out.println(strInt1);
		System.out.println(strInt2);
				
		System.out.println("The sum of " + anInteger + " and " + strInt + " is " + anInteger + strInt);

		//We want the sum to be 7
		int sum;
		sum = 0;
		sum = anInteger + Integer.valueOf(strInt);
		System.out.println("The sum of " + anInteger + " and " + strInt + " is " + sum );
		
	}
	
	public static void exercise03(){
		//Comparacion de Strings
		String string0 = "Hello";
			
		String firstHalf = "He";
		String secondHalf = "llo";
		String string1 = firstHalf + secondHalf;
				
		String string2 = "hello";
		boolean areEquals1;
		boolean areEquals2;
				
		areEquals1 = (string0 == string1);
		System.out.println("Strings " + string0 + " and " + string1 + " are equals: " + areEquals1);
			
		// your code here	
		areEquals1 = string0.equals(string1);
		System.out.println("Strings " + string0 + " and " + string1 + " are equals: " + areEquals1);
						
		areEquals2 = string0.equals(string2);
		System.out.println("Strings " + string0 + " and " + string2 + " are equals: " + areEquals2);

		// your code here	
		areEquals2 = string0.equalsIgnoreCase(string2);
		System.out.println("Strings " + string0 + " and " + string2 + " are equals: " + areEquals2);		
		
	}
	
	public static void exercise04(){
		String string=   "1234abcde";		
		int length = string.length();//Get the length
		int index = length/2;//Calculate the index of the middle position of the string
		char character = string.charAt(index);//Extract the character in that position
		System.out.println(character);//Print the character to screen
		char character2 = string.charAt(0);//Get the first character of the string and print it to screen
		System.out.println(character2);
		char character3 = string.charAt(length-1);//Get the last character and print it tos creen (hint: use the length of the string)
		System.out.println(character3);

	}
	
	public static void exercise05(){
		String stringWithoutQuotes = "the string";
		//Modify the assignment to have the word "string" within double quotes. 
		String stringWithQuotes = "the \"string\"";
		System.out.println(stringWithoutQuotes);
		System.out.println(stringWithQuotes);

		String stringWithoutTabs = "7 20 1 10";
		//Modify the assignation to have tabs instead of white spaces between numbers. 
		String stringWithTabs = "7\t20\t1\t10";
		System.out.println(stringWithoutTabs);
		System.out.println(stringWithTabs);

		String stringOneLine =  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eget metus rutrum, aliquet est a, vulputate dui.";
		//Modify the assignation to add a new line between the two sentences
		String stringTwoLines = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\nPhasellus eget metus rutrum, aliquet est a, vulputate dui.";
		System.out.println(stringOneLine);
		System.out.println(stringTwoLines);
				
		//Print to screen a string with the path C:\Program Files\Java
		String stringPathWindows = "C:\\Program Files\\Java";
		System.out.println(stringPathWindows);	

	}
	
	public static void exercise06(){
		String stringWithSpaces = "    Cadena con espacios    ";
		//Complete the assignment to remove the leading and trailing spaces from stringWithSpaces
		String stringWithoutSpaces = stringWithSpaces.replaceAll("\\s+","");

		System.out.println("The string with spaces is     ("+stringWithSpaces +")");
		System.out.println("The string without spaces is ("+stringWithoutSpaces +")");
	}
	
	public static void exercise07(){
		String smallText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eget metus rutrum, aliquet est a, vulputate dui. Phasellus lobortis sit amet purus id viverra. Sed in nisi libero. Mauris suscipit maximus tortor sit amet sagittis. Nunc a congue libero, quis pulvinar justo. Quisque faucibus, nisl et imperdiet lacinia, lacus risus dapibus ex, sit amet tincidunt leo augue id sapien. Fusce suscipit vitae dolor et aliquet.";

		System.out.println(smallText);
		boolean start =smallText.startsWith("Lorem");	System.out.println(start);//Check if the string starts with "Lorem". Print the result to screen
		boolean end =smallText.endsWith("aliquet");	System.out.println(end);//Check if the string ends with "aliquet". Print the result to screen
		int index = smallText.indexOf("sit");	System.out.println(index);//Get and print to screen the index of the first occurrence of the word "sit"
		boolean contains = smallText.contains("amet");	System.out.println(contains); //Check if the string contains the word "amet". Print the result to screen

	}
	
	public static void exercise08(){
		String spanishAlphabet = "abcdefghijklmnñopqrstuvwxyz";
		String englishAlphabet = "";
		String englishAlphabetUpperCase = "";
		int lenght = spanishAlphabet.length();
		int index = spanishAlphabet.indexOf("ñ"); //Get the index of 'ñ'
		String englishAlphabet1 = spanishAlphabet.substring(0, index-2);//Get the substring until 'ñ'(not included)
		String englishAlphabet2 = spanishAlphabet.substring(index+2, lenght);//Get the substring from 'ñ'(not included) to the end
		englishAlphabet = englishAlphabet1.concat(englishAlphabet2);//Concatenate the two substrings using the concat method
		englishAlphabetUpperCase = englishAlphabet.toUpperCase();//Convert the resulting string to upper case

		System.out.println(spanishAlphabet);
		System.out.println(englishAlphabet);
		System.out.println(englishAlphabetUpperCase);

	}
	
	public static void exercise09(){
		String nombre = "David Rico";
		int lenght = nombre.length();
		int separation = nombre.indexOf(' ');
		String apellido = nombre.substring(separation+1, lenght);
		int inicial = 0;
		System.out.println(nombre.charAt(inicial)+"."+ apellido.charAt(inicial)+".");
	}
	
	public static void exercise10(){
		String palindrome = "abba";
		int length = palindrome.length();
		boolean isPalindrome = false;
		//Your code here
		StringBuffer reversemethod = new StringBuffer(palindrome);
		StringBuffer reverse = reversemethod.reverse();
		if (palindrome.equals(reverse.toString())) {
			isPalindrome = true;
		}else {
			isPalindrome = false;
		}	
		System.out.println("The string "+ palindrome +" is a palindrome: " + isPalindrome);
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
