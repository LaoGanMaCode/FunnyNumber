
import java.util.Scanner;
public class lab13 {


	public String isNumber() {
		Scanner input = new Scanner(System.in);
		String result;

		float num = input.nextFloat();
		float sult = num/3;

		if(sult == 1) {
			result = "Fizz";
			return result;
		}else {
			String s=String.valueOf(sult);
			return s;
		}


	}
	
}