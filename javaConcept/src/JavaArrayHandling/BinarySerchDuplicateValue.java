package JavaArrayHandling;

import java.util.Arrays;

public class BinarySerchDuplicateValue {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,30,30,30};
		int key=30;
		int result=Arrays.binarySearch(arr,key);
		System.out.println(result);
		
		if(arr[result+1]==key || arr[result-1]==key)
		{
			System.out.println("yes we have a duplicate in Index:");
		}

	}

}
