import java.util.Random;
class RandomDemo {
  public static void main(String[] args) {
    Random rand = new Random();
	for (int i = 0; i < 5000; i++){
		int num = rand.nextInt(100) + 1;
		System.out.println(num);
  	}
  }
}
