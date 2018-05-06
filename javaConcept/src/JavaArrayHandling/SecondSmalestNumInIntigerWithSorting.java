package JavaArrayHandling;

import java.util.Arrays;

public class SecondSmalestNumInIntigerWithSorting {

	public static void main(String[] args) {
		int numbers[] = {6,3,37,12,46,5,64,21};
		 
		  Arrays.sort(numbers);
		 
		  System.out.println("Smallest Number: "+numbers[0]);
		  System.out.println("Second Smallest Number: "+numbers[1]);


	}

}
