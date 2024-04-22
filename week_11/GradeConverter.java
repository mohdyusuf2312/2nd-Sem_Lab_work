/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package week_11;

import java.io.*;

public class GradeConverter {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("E:/YUSUF MCA LAB WORK/src/week_11/grades.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("E:/YUSUF MCA LAB WORK/src/week_11/letter.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals("-1")) {
                    break;
                }
                int grade = Integer.parseInt(line);
                String letterGrade = calculateLetterGrade(grade);
                writer.write(letterGrade + "  \n");
                writer.newLine();
            }

            reader.close();
            writer.close();
            System.out.println("Letter grades have been written to letter.txt");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static String calculateLetterGrade(int score) {
        if (score >= 90) {
            return "A+";
        } else if (score >= 85) {
            return "A";
        } else if (score >= 80) {
            return "B+";
        } else if (score >= 75) {
            return "B";
        } else if (score >= 65) {
            return "C+";
        } else if (score >= 60) {
            return "C";
        } else if (score >= 55) {
            return "D+";
        } else if (score >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
