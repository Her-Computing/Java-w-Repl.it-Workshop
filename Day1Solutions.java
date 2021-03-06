class Day1Solutions {
  
  	//factorial
	public long factorial(int n) {
    	long fact = 1;
    	for (int i = 2; i <= n; i++) {
        	fact *= i;
    	}
    	return fact;
	}

  	//coding bat solutions
	public boolean sleepIn(boolean weekday, boolean vacation) {
  		if (!weekday || vacation) {
    		return true;
  		}
  		return false;
	}

	public boolean hasTeen(int a, int b, int c) {
		if (a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19){
			return true;
		}
		return false;
	}

	public int sumDouble(int a, int b) {
		if (a != b) {
			return a+b;
		}
		return (a+b) * 2;
	}
}
