/*
 * Ahmad, Atif
 * CS A170
 * September 22, 2015
 * 
 * Project: IC08_HackerChallenge
 */
import java.util.Scanner;

public class HackerChallenge {

	public static void main(String[] args) {
		int randomNumber;
		int typeOfAnswerNumber = 0;
		char response;
		String randomAnswer = " ";
		String typeOfAnswer = " ";
		Scanner consoleScanner = new Scanner(System.in);
		
		do
		{
			System.out.println("What question would you like to ask?");
			consoleScanner.nextLine();
			randomNumber = (int)(Math.random()*20)+1;
			switch(randomNumber)
			{
			case 1:
				randomAnswer = "It is certain";
				typeOfAnswerNumber = 1;
				break;
			case 2:
				randomAnswer = "It is decidedly so";
				typeOfAnswerNumber = 2;
				break;
			case 3:
				randomAnswer = "Without a doubt";
				typeOfAnswerNumber = 3;
				break;
			case 4:
				randomAnswer = "Yes, definitely";
				typeOfAnswerNumber = 4;
				break;
			case 5:
				randomAnswer = "You may rely on it";
				typeOfAnswerNumber = 5;
				break;
			case 6:
				randomAnswer = "As I see it, yes";
				typeOfAnswerNumber = 6;
				break;
			case 7:
				randomAnswer = "Most likely";
				typeOfAnswerNumber = 7;
				break;
			case 8:
				randomAnswer = "Outlook good";
				typeOfAnswerNumber = 8;
				break;
			case 9:
				randomAnswer = "Yes";
				typeOfAnswerNumber = 9;
				break;
			case 10:
				randomAnswer = "Signs point to yes";
				typeOfAnswerNumber = 10;
				break;
			case 11:
				randomAnswer = "Reply hazy try again";
				typeOfAnswerNumber = 11;
				break;
			case 12:
				randomAnswer = "Ask again later";
				typeOfAnswerNumber = 12;
				break;
			case 13:
				randomAnswer = "Better not tell you now";
				typeOfAnswerNumber = 13;
				break;
			case 14:
				randomAnswer = "Cannot predict now";
				typeOfAnswerNumber = 14;
				break;
			case 15:
				randomAnswer = "Concentrate and ask again";
				typeOfAnswerNumber = 15;
				break;
			case 16:
				randomAnswer = "Don't count on it";
				typeOfAnswerNumber = 16;
				break;
			case 17:
				randomAnswer = "My reply is no";
				typeOfAnswerNumber = 17;
				break;
			case 18:
				randomAnswer = "My sources say no";
				typeOfAnswerNumber = 18;
				break;
			case 19:
				randomAnswer = "Outlook not so good";
				typeOfAnswerNumber = 19;
				break;
			case 20:
				randomAnswer = "Very doubtful";
				typeOfAnswerNumber = 20;
				break;
			}
			
			switch(typeOfAnswerNumber)
			{
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				typeOfAnswer = "Positive";
				break;
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
				typeOfAnswer = "Neutral";
				break;
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
				typeOfAnswer = "Negative";
				break;
			}
			System.out.println("The answer is: " + randomAnswer);
			System.out.println("This answer is: " + typeOfAnswer);
			System.out.println();
			System.out.println("Would you like to ask another question (type Y or N)?");
			response = consoleScanner.nextLine().toUpperCase().charAt(0);
			
			
		}
		while(response == 'Y');
		
		if(response == 'N')
		{
			System.out.println("Thank you for playing the Magic 8 Ball.");
		}
		
		consoleScanner.close();

	}

}
