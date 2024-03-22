package week_7;
import java.util.Arrays;
import java.util.Scanner;
public class _3_SortWithLexicographically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Read in three strings
        System.out.println("Enter three strings:");
        String[] strings = new String[3];
        for (int i = 0; i < 3; i++) {
            strings[i] = scanner.next();
        }

        // Sort the strings lexicographically
        Arrays.sort(strings);

        // Output the sorted strings
        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.print(str + " ");
        }
        scanner.close();
	}

}
