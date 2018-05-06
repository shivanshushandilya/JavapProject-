package JavaArrayHandling;

import java.util.Scanner;

public class EvenOrOddByusingAmpersion {

	public static void main(String[] args) {
		int number;
	    Scanner in= new Scanner(System.in);
	 
	    System.out.println("Enter a number to check even or odd");
	    number=in.nextInt();
	 
	    if((number & 1)==0)
	    	
	    	// if((number / 2)*2==number) using division 
	    	// if((number % 2)==0)    using Modulus 
	    	//if( ( number >> 1) <<1==number) using shift 
	    
	    {
	        System.out.println(+number+" is Even number");
	    }else{
	        System.out.println(+number+" is Odd Number");

	}

}
}
