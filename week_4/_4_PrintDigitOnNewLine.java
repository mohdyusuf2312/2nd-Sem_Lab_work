package week_4;
import java.util.Scanner;
public class _4_PrintDigitOnNewLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a four digit number : ");
		int n=s.nextInt();
		int rev=0, lastD;
		while(n!=0)
		{
			lastD=n%10;
			rev = (rev*10)+lastD;
			n/=10;
		}
		while(rev!=0)
		{
			lastD=rev%10;
			System.out.println(lastD);
			rev/=10;
		}
		s.close();
	}

}
