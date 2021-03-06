/*
PLAN
1. variables
2. printing to console
3. strings formatting "\n"
4. math operations, +=, -=, *=, /= , %=
5. if-else
6. for loops
7. while loops
8. scanner user input 
9. external functions 

Problems:
1. factorial calculator with while loops
2. Coding Bat
	a. https://codingbat.com/prob/p187868
	b. https://codingbat.com/prob/p178986
	c. https://codingbat.com/prob/p154485

WHAT WE ACTUALLY DID:
up for 6 (For loops)
*/

class Day1 {
  public static void main(String[] args) {
	  int x = 5;
	  System.out.println("value of x: " + x);
	  x = 8;
	  System.out.println("value of x: " + x);

	  boolean y = false;
	  System.out.println(y);

	  String name = "Tanish";
	  char firstCharacterOfName = 't';
	  System.out.println(firstCharacterOfName);

	System.out.println("Hello my name is Tanish \n and I am 15 years old!!");	
	System.out.println("\nHello my name is Tanish");
	System.out.println("and I am 15 years old");

	System.out.println("\n \t test");

	int x = 7;
	x %= 3;
	System.out.println(x);

	int age = 55; 
	// System.out.println(age);
	// if (age <= 18) {
	// 	System.out.println("you are a kid");
	// } else if (age >= 55) {
	// 	System.out.println("you are very old");
	// }

	// if age > 0 and age < 18: print to console ("kid")
	// if age = 18 print(you are 18)
	// if age >= 18 and age <= 70 print(adult)
	// if age > 70 or age < 90 print(old)
	// else print("you are very old");
	
	if (age > 0 && age < 18) {
		System.out.println("kid");	
	} else if (age == 18) {
		System.out.println("you are 18");
	} else if (age >= 18 && age <= 70) {
		System.out.println("adult");
	} else if (age > 70 || age < 90) {
		System.out.println("old");
	} else {
		System.out.println("you are very old");
	}

	// String name = "Tanish";
	// String name2 = "Tanish";
	if (name.equals(name2)) {
		System.out.println("names match");
	} else {
		System.out.println("names do not match");
	}

	int x = 5;
	for (int i = 0; i < 60; i+=2) {
		x++;
		if (x > 5) {
			System.out.println("x is greater than 5: " + x);
		}
	}

  }
}
