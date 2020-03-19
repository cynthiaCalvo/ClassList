/*
 * Cynthia C.
 * 11th March 2020
 * make a class lists
 */
package arrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> classList = new ArrayList<String>();
		int userChoice, times = 0;
		String remove;
		
		//will loop until the user chooses to exit(4) 
		do {
			System.out.println("\nChoose from the following menu options: ");
			System.out.println("1.add student\n2.remove student\n3.display student list\n4.exit");
			System.out.print("\nWhat is your choice? ");
			userChoice = input.nextInt();
			
			//will ask for which action the user would like
			while(userChoice < 1 || userChoice > 4) {
				System.out.print("\nPlease enter an applicable value: ");
				userChoice = input.nextInt();
			}
			
			//will initiate the action the user wanted
			if(userChoice == 1) {
				classList.add(addName());
			}else if(userChoice == 2) {
				//will loop until the name chosen to remove exists on the list
				do{
					remove = removeName(times);
					times++;
				}while(!classList.contains(remove));
				classList.remove(remove);
				
			}else if(userChoice == 3) {
				System.out.println("These are the students in the class: ");
				
				//will loop until all the names on the list are printed out
				for(String str:classList) {
					System.out.println(str);
				}
			}else {
				System.out.println("\nHave a good day!");
			}
		}while(userChoice != 4);

	}
	
	/**
	 * will ask for input for adding a student's name
	 * will return the name
	 * @return
	 */
	public static String addName() {
		Scanner input = new Scanner(System.in);
		String name;
		System.out.print("What is the students' name? ");
		name = input.nextLine();
		
		return name;
	}
	
	/**
	 * will ask for input for removing a student's name
	 * will return the name
	 * @return
	 */
	public static String removeName(int times) {
		Scanner input = new Scanner(System.in);
		String name;
		
		if(times == 0) {
			System.out.print("Which student would you like to remove? ");
		}else {
			System.out.println("That name does not exist on the class list\nPlease enter a relavent name: ");
		}
		name = input.nextLine();
		
		return name;
	}
		

}
