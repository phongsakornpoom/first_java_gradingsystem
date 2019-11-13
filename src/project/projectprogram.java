package project;

import java.util.*;
import java.io.*;

public class projectprogram {
	public static void main(String[] args) throws FileNotFoundException {//method
		Scanner console = new Scanner(System.in);
		System.out.println("Welcome to the grading system");
		System.out.println("please enter the number of student");
		int n = console.nextInt();
		console.nextLine();
		String ling[] = new String[n];
		input(ling);
	}
	public static void input(String[] ling) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		for (int i = 0; i < ling.length; i++) {// student loop
			// name and subject input
			PrintStream filecon = new PrintStream(new File("student" +(i+1) + ".txt"));
			String sub;
			String can = "candidate " + (1 + i);
			System.out.println("what is the name of  " + can);
			String name = console.nextLine();
			System.out.println("how many subject does " + name + " take?");
			int sunnum = console.nextInt();
			console.nextLine();
			for (int j = 1; j <= sunnum; j++) {// subject loop
				System.out.println("what is the name of subject" + j + " that " + name + " take?");
				sub = console.nextLine();
				// attandace grading
				System.out.println("enter the attandace for " + name + " in " + sub);
				int at = console.nextInt();
				console.nextLine();
				System.out.println("enter the maximum score for " + sub);
				int max = console.nextInt();
				console.nextLine();
				double atpercent = (at / max) * 10;//calculation
				// assignment grading
				System.out.println("enter assignment score for " + name + "in" + sub);
				int ass = console.nextInt();
				console.nextLine();
				System.out.println("enter the maximum score for " + name + "in" + sub);
				int max1 = console.nextInt();
				console.nextLine();
				double asspercent = (ass / max1) * 20;//calculation
				// project grading
				
				System.out.println("enter the project score for" + name + "in" + sub);
				int project = console.nextInt();
				console.nextLine();
				System.out.println("enter the maximum score for project in " + sub);
				int max2 = console.nextInt();
				console.nextLine();
				double projectpercent = (project / max2) * 15;//calculation
				// mid term exam grading
				System.out.println("enter the midterm score for " + name + "in" + sub);
				int mid = console.nextInt();
				System.out.println("enter the maximum score for midterm in " + sub);
				int max3 = console.nextInt();
				console.nextLine();
				double midpercent = (mid / max3) * 25;//calculation
				// final exam grading
				System.out.println("input your final score for " + name + " in " + sub);
				int fin = console.nextInt();
				console.nextLine();
				System.out.println("enter the maximum score for final in " + sub);
				int max4 = console.nextInt();
				console.nextLine();
				double finpercent = (fin / max4) * 30;//calculation
				// grade calculation
					double total = finpercent + asspercent + midpercent + atpercent + projectpercent;
					double gradeI, gradeA, gradeB, gradeC, gradeD, gradeF;
					gradeF = -1;
					gradeD = 59;
					gradeC = 69;
					gradeB = 79;
					gradeA = 89;
					gradeI = 100;
					String p = "The overall grade for " + name + " ";
					if (total > gradeA) {//grade boundaries
						System.out.println(p + " in " + sub + " is " + "A");
						filecon.println(p + " in " + sub + " is " + "A");
					} else if (total > gradeB) {
						System.out.println(p + " in " + sub + " is " + "B");
						filecon.println(p + " in " + sub + " is " + "B");
					} else if (total > gradeC) {
						System.out.println(p + " in " + sub + " is " + "C");
						filecon.println(p + " in " + sub + " is " + "C");
					} else if (total > gradeD) {
						System.out.println(p + " in " + sub + " is " + "D");
						filecon.println(p + " in " + sub + " is " + "D");
					} else if (total > gradeF) {
						System.out.println(p + " in " + sub + " is " + "F");
						filecon.println(p + " in " + sub + " is " + "F");
					} else {
						System.out.println("Error.");//if the grade add up is 
						filecon.println("Error.");
					}//output
					System.out.println("the percentage " + name + " get is " + total);//print to screen
					System.out.println("The attendace for " + sub + " :" + at + "/" + max);
					System.out.println("The assignment for " + sub + " :" + ass + "/" + max1);
					System.out.println("The project for " + sub + " :" + project + "/" + max2);
					System.out.println("The mid term exam for " + sub + " :" + mid + "/" + max3);
					System.out.println("The final exam for " + sub + " :" + fin + "/" + max4);
					System.out.println("The grade for " + "" + name + " has be recorded");
					filecon.println("the percentage " + name + " get is " + total);//print to file
					filecon.println("The attendace for " + sub + " :" + at + "/" + max);
					filecon.println("The assignment for " + sub + " :" + ass + "/" + max1);
					filecon.println("The project for " + sub + " :" + project + "/" + max2);
					filecon.println("The mid term exam for " + sub + " :" + mid + "/" + max3);
					filecon.println("The final exam for " + sub + " :" + fin + "/" + max4);
					filecon.println("The grade for " + "" + name + " has be recorded");
					// word end of the loop
				}
			}
System.out.println("Thank you for using the program have a nice day.");// word when exit																					// word
		}
}
