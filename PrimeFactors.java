import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int res = 0;
		int originalN = number;

		while(number % 2 == 0) {
			res += 2;
			number /= 2;
		}


		for(int i = 3; i < Math.sqrt(number); i+=2) {
			while(number % i == 0) {
				res += i;
				number /= i;
			}
		}

		if (number > 2) {
			res += number;
		}
		System.out.println("The sum of all prime factors of " + originalN + " is: " + res);
        
        scanner.close();
	}
}
