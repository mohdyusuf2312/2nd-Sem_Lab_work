package week_4;
import java.util.Scanner;
public class _1_FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of terms : ");
		int m = s.nextInt();
		int first = 0, second = 1, next, count = 0;
		do
		{
			next = first+second;
			System.out.print(first+" ");
			count++;
			first = second;
			second = next;
		}while(count!=m);
		s.close();
	}

}