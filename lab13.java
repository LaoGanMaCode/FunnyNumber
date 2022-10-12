
import java.util.Scanner;
public class lab13 {


	public String isNumber(int input_num) {

		String result;
		int save1;

		save1 = input_num;

		if(input_num%3 == 0 && save1%5 !=0) {
			return "Fizz";
		}else if(input_num%5 == 0 && save1%3 !=0) {
			return "Buzz";


		}else if(input_num%3 == 0 && save1%5 ==0) {
			return "FizzBuzz";
		}

		else {
			String s = String.valueOf(input_num);
			return s;
		}

	}
	
}