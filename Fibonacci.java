//This program shows steps of the Fibonacci sequence less than 10000
public class Fibonacci{
	
	static final int MAX_TERM_VALUE = 20;
		public static void main(String[] args) {
			int x = 0;
			int y = 1;
			int total = 1;
			int term = 0;
			System.out.println("0");
			while (term < MAX_TERM_VALUE) {
				System.out.println(total);
				total = (x + y);
				x = y;
				y = total;
				term++;
			}
		}
}