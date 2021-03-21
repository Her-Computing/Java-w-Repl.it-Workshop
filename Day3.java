import java.io.*;
import java.util.*;

class Day3 {
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(new File("practice_input.in"));
    PrintWriter out = new PrintWriter(new File("practice_input.out"));
	
    int x = in.nextInt();
    System.out.println(x);

    int[] array = new int[x];
    for (int i = 0; i < x; i++) {
      int num = in.nextInt();
      array[i] = num;
    }

    for (int i = 0; i < x; i++) {
      System.out.println(array[i]);
    }

    String line = in.nextLine();

    out.println(line);	
    out.close();
  }
}
