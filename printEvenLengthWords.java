// Day-01 write a java to print even length words from a string

import java.util.Scanner;
public class printEvenLengthWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String inputText = scan.nextLine();
		String[] wordsArray = inputText.split(" ");
		
		for(String currentWord : wordsArray)
		{
			if(currentWord.length() % 2 == 0)
			{
				System.out.println(currentWord);
			}
		}

	}

}

/* Logic of the program 
   suppose i have string = "sky is blue and vast" and output of the program is must be 'is' 'blue' 'vast' because their length is even(2, 4, 4)
   to achieve this we need break the string by using spit(" ") inbuilt method so that we get individual words and then we need to store those in string array
   then we need add checker if the word length is even or not for this we can use "str.lenght() %2 == 0" 
   
   The line for(String currentWord : wordsArray) is a foreach loop in Java. It iterates over each element in the array wordsArray, assigning each element in turn to the variable currentWord. Here's what it does:

	String currentWord: This declares a variable currentWord of type String, which will hold the current element of the array during each iteration of the loop.
	: wordsArray: This specifies the array to iterate over, which is wordsArray in this case.
	The loop will iterate over each element of wordsArray, and during each iteration, the current element will be assigned to the variable currentWord. The loop will continue until all elements of wordsArray have been processed.
 */
