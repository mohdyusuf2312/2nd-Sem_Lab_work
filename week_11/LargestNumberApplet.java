/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package week_11;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class LargestNumberApplet extends Applet implements ActionListener {
    TextField textField1, textField2, textField3;
    Button findButton;
    Label resultLabel;

    public void init() {
        textField1 = new TextField(10);
        textField2 = new TextField(10);
        textField3 = new TextField(10);
        findButton = new Button("Find Largest");
        resultLabel = new Label("");

        add(new Label("Enter three numbers: "));
        add(textField1);
        add(textField2);
        add(textField3);
        add(findButton);
        add(resultLabel);

        findButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        double num1 = Double.parseDouble(textField1.getText());
        double num2 = Double.parseDouble(textField2.getText());
        double num3 = Double.parseDouble(textField3.getText());

        double largest = Math.max(num1, Math.max(num2, num3));

        resultLabel.setText("Largest number is: " + largest);
    }
}
