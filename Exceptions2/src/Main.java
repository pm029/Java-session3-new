//Script to show how to write exception case - this shows the number format exception and also the arithmetic exception
//also towards the bottom it looks into the generic exception.

public class Main {

	public static void main(String[] args) {
		
		String num1,num2;
		float result;
		
		num1="4";
		num2="0";
		
		try {
			//you can have this as Integer.parseInt 
		result=Float.parseFloat(num1)/Float.parseFloat(num2);
			System.out.println("result is "+ num1+num2);
		}
		
		//the name ref1 is used here but anything can be used it. Its just local variable - always needs to be lower-case
		
		catch(NumberFormatException ref1) {
			System.out.println("Only digits can be used in operations");
		}
		catch(ArithmeticException ref2) {
			System.out.println(" cant divide anything by zero");
		}
		//this exception should be put right to the end, so the first two exception will be ran first and then the 
		//rest of the other exception class are checked
		
		catch(Exception ref) {
			System.out.println("Something went wrong");
		}
		
		

	}

}
