//Project: Project 4
//Author: Roger H Hayden III
//Desc: Using Methods
//Version: 1.0
//Last Update: 9/28

import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in); 
//display messages are calling methods		
displayMessage(); 
displayMessage2(); 
	int userChoice = keyboard.nextInt(); 
		System.out.println("You selected " + userChoice); 
displayMessage3();
	long num = keyboard.nextLong(); 
		System.out.println("You selected " + num + " as your first number.");
displayMessage4();
	long num2 = keyboard.nextLong();
		System.out.println("You selected " + num2 + " as your second number.");
//calling methods within if statements
		if (userChoice == 1) {
			addNumber(num, num2); 
		}
		else if (userChoice ==2) {
			subtractNumber(num, num2);
		}
		else if (userChoice ==3) {
			multiplyNumber(num, num2);
		}
		else if (userChoice ==4) {
			multiAddNumber (num, num2); 
		}
		else {
			System.out.println("Please go back and pick a number that was listed in the options menum.");
		}

	}



//Methods that I can call

public static void displayMessage() {
	System.out.println("Hello, please pick of of the following four options");
		}
public static void displayMessage2() {
	System.out.println("1. Addition");
	System.out.println ("2. Subtraction");
	System.out.println("3. Multiplication");
	System.out.println("4. Multiplication and then Addition");
}
public static void displayMessage3() {
	System.out.println("Please pick one number.");
	}
public static void displayMessage4() {
	System.out.println("Please pick another number.");
}
//bellow are methods for the menu choices
public static long addNumber (long num, long num2) {
	long total;
	total = num + num2;
	System.out.println("Your total is " + total);
	return total;
}
public static long subtractNumber (long num, long num2) {
	long total;
	total = num - num2;
	System.out.println("Your total is " + total);
	return total;
}
public static long multiplyNumber (long num, long num2) {
	long total;
	total = num*num2;
	System.out.println("Your total is " + total);
	return total;
}
public static long multiAddNumber (long num, long num2) {
	long total;
	total = (num*num2) + num2;
	System.out.println("Your total is " + total);
	return total;
}
}




