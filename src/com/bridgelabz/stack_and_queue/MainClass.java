package com.bridgelabz.stack_and_queue;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack();

		while (choice != 4) {
			System.out.println("Chose one from the below options ");
			System.out.println("\n1.Push\n2.Display\n3.Pop\n4.Exit");
			System.out.println("Enter your choice: ");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				stack.push(sc);
				break;
			case 2:
				stack.display();
                break;
			case 3:
				stack.pop();
                break;
			case 4:
				 System.out.println("Exit the program");
                 System.exit(0);
                 break;
			default:
				System.out.println("Please Enter valid choice ");
			}
		}
	}
}
