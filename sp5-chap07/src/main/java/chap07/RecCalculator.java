package chap07;

public class RecCalculator implements Calculator{

	@Override
	public long factorial(long num) {
			try {
			if(num == 0)
				return 1;
			else
				return num*factorial(num-1);
		} finally {

		}
	}
	
}
