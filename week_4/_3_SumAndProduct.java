package week_4;
import java.util.Scanner;
public class _3_SumAndProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a four digit number : ");
		int n = s.nextInt();
		int lastD, sum=0, prod=1;
		while(n!=0)
		{
			lastD=n%10;
			sum+=lastD;
			prod*=lastD;
			n/=10;
		}
		System.out.println("Sum of four digit is : "+sum);
		System.out.println("Product of four digit : "+prod);
		s.close();
	}

}
