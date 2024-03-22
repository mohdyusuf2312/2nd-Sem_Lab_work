package week_4;
import java.util.Scanner;
public class _2_CombinationOfThreeDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int arr[]=new int[3];
		for(int i=0; i<3; i++)
		{
			System.out.println("Enter element "+(i+1)+" : ");
			arr[i] = s.nextInt();
		}
		System.out.println("All posible combinations are : ");
		for(int i=0; i<3; i++)
			for(int j=0; j<3; j++)
				for(int k=0;k<3;k++)
					if(arr[i]!=arr[j]&&arr[j]!=arr[k]&&arr[k]!=arr[i])
						System.out.println(arr[i]+","+arr[j]+","+arr[k]);
		s.close();
	}

}
