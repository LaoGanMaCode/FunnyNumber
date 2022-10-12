
import java.util.Scanner;
public class lab13 {


	public String isNumber() {
		Scanner input = new Scanner(System.in);
		String result;

		int num = input.nextInt();
		boolean ifNum = true;

		if(num%3 == 0) {
			return "Fizz";
		}else if(num%5 == 0) {
			return "Buzz";
		}else if(num%3 == 0 && num%5 == 0) {
			return "FizzBuZZ";
		}
		else {
			String s = String.valueOf(num);
			return s;
		}


	}
	
}