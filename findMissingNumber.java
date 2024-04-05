//Write a Java program to print the missing numbers form array of numbers

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class findMissingNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter numbers from 0 to 7");
		
		for(int i=0; i<=arr.length-1;i++)
		{
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		HashSet <Integer> dataSet = new HashSet<Integer>();
		for (int num : arr) {
            dataSet.add(num);
        }
		int max = arr[arr.length-1];
		for(int i=0; i<=max;i++)
		{
			if(!dataSet.contains(i))
			{
				System.out.println(i);
			}
		}
	}
}

/* Login of the Program
	suppose we have a array [2, 3, 5, 6, 8] and we need to print the missing numbers of this array 
	so we need sort this at very first step by using Arrays.sort() inbuilt method so we will get the min and max numbers
	then i have used hashset to store the array value because the hashset wont store any duplicate value
	now we need check the value is present or not by using inbuilt method set.contains() 
	using this i have used simple for loop which runs from 0 to max value and checks if the hashset contains the number or not 
	if number is present just print it
 *  */
