/*
1. while loops
2. scanner user input 
3. external functions 
4. reading and writing to files

Problems:
1. factorial calculator with while loops
2. Coding Bat
	a. https://codingbat.com/prob/p187868
	b. https://codingbat.com/prob/p178986
	c. https://codingbat.com/prob/p154485
*/

// import java.io.*;
// import java.util.*;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Scanner in = new Scanner(new File("practice_input.in"));
    // PrintWriter out = new PrintWriter(new File("practice_input.out"));

	// while loops
	for (int i = 0; i < 5; i++) {
		System.out.println(i);
	}
	System.out.println("\n");
	int i = 0;
	while (i < 5) {
		System.out.println(i);
	}

	boolean run = true;
	int i = 0;
	while (run) {
		System.out.print(i + " ");
		i++;
		if (i > 10) {
			run = false;
		}
	} 

	// taking user input
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a string");
	String str = input.nextLine();
	System.out.println("Your sentence is: " + str);


	//external functions
	int x = 5;
	int n = number(x);
	System.out.println(n);
  }

  public static int number(int i) {
	if (i < 5) {
		return 655;
	}
	return 677;
  } 
}
