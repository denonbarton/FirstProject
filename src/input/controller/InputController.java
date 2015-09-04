package input.controller;

import java.util.Scanner;

public class InputController
{
	//declaration section
	//All class data members are declared private
	// also known as class variables 
	private Scanner myInput;
	
	//constructors go here
	
	public InputController()
	{
		myInput = new Scanner(System.in);
	}
	
	//methods
	{
		questions();
	}
	
	public void start()
	
	private void questions()
	{
		System.out.println("hey, whats your name?");
		String input;
		input = myInput.next();
		myInput.nextLine();
		System.out.println("Your name is " + input + " ,that is neat!");
		System.out.println("oops did you miss your full name? PLEASE Type it again");
		String FullName = myInput.nextLine();
		System.out.println("Your full name is: " + FullName);
		System.out.println("Your age please?");
		int myAge = myInput.nextInt();
		System.out.println("Wow " + input + " you are " + myAge + " years old!!");
	}
	
	
	{
		
		
	}
}
	
