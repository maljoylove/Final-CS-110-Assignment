//Mallory Joy
//CS 110
//This is just for me to make sure I know this is working

import java.util.Scanner;

public class GitHubTest
{
	public static void main (String [] args)
	{

	//create keyboard for user input
	Scanner keyboard = new Scanner(System.in);
	int MalNum; 
	
	System.out.println("Please type Mallory's favorite number here: ");
	MalNum = keyboard.nextInt();
	
	
	while(MalNum!= 13)
		{
		System.out.println("I'm sorry, that's not right.");
		System.out.println("Please type Mallory's favorite number here: ");
		MalNum = keyboard.nextInt();
		}
	
	System.out.println("Mallory's favorite number is " + MalNum);
	
	}
}