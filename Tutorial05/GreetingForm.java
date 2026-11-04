/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.greetingform;

import javax.swing.*;
import java.awt.*;
public class GreetingForm {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Island Welcome");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new FlowLayout());
            JTextField field = new JTextField(14);
            JButton button = new JButton("Greet");
            // TODO: add an ActionListener; show a dialog using field.getText().
            button.addActionListener(e-> JOptionPane.showMessageDialog(frame,"Hello "+ field.getText()));
            frame.add(new JLabel("Visitor name:"));
            frame.add(field); frame.add(button);
            frame.pack(); frame.setVisible(true);
        });
    }
}
