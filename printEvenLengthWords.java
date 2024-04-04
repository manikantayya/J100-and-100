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
