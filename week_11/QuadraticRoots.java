/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package week_11;

import java.io.*;

public class QuadraticRoots {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("E:/YUSUF MCA LAB WORK/src/week_11/data.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("E:/YUSUF MCA LAB WORK/src/week_11/output.txt", true));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] coefficients = line.split(" ");
                double a = Double.parseDouble(coefficients[0]);
                double b = Double.parseDouble(coefficients[1]);
                double c = Double.parseDouble(coefficients[2]);

                double discriminant = b * b - 4 * a * c;

                if (discriminant >= 0) {
                    double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                    double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

                    writer.write("Root 1: " + root1 + "\n");
                    writer.newLine();
                    writer.write("Root 2: " + root2 + "\n");
                    writer.newLine();
                } else {
                    writer.write("The roots are imaginary.\n");
                    writer.newLine();
                }
                writer.newLine();
            }

            reader.close();
            writer.close();
            System.out.println("Roots have been written to output.txt");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
