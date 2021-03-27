import java.util.Scanner;
class QuizDemo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.println("How many days are in a week?");
	int answerForQuestion1 = input.nextInt();
	if (answerForQuestion1 == 7) {
		System.out.println("You got it correct!");
	} else {
		System.out.println("You got it wrong! The correct answer was: 7");
	}
	System.out.println("Type the word no");
	String answerForQuestion2  = input.nextLine();
	if (answerForQuestion2.equals("no")) {
		System.out.println("You got it correct!");
		System.out.println("How many days are in a week?");
		int answerForQuestion3 = input.nextInt();
		if (answerForQuestion3 == 7) {
			System.out.println("You got it correct!");
		} else {
			System.out.println("You got it wrong! The correct answer was: 7");
		}
	} else {
		System.out.println("You got it wrong! The correct answer was: dog");
	}
  }
}
