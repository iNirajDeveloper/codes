package com.tssm.prac;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class result extends JFrame {
    private JTextField[] subjectFields;
    private JButton calculateButton;

    public result() {
        setTitle("Exam Result Calculator");
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and set layout manager
        setLayout(new GridLayout(0, 2, 2, 2));

        // Create text fields for each subject
        subjectFields = new JTextField[5];
        for (int i = 0; i < subjectFields.length; i++) {
            subjectFields[i] = new JTextField();
            add(new JLabel("Subject " + (i + 1) + " Marks:"));
            add(subjectFields[i]);
        }

        // Create Calculate button
        calculateButton = new JButton("Calculate Result");
        add(calculateButton);

        // Add action listener to the Calculate button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateResult();
            }
        });
    }

    private void calculateResult() {
        try {
            // Get marks for each subject
            int[] marks = new int[subjectFields.length];
            for (int i = 0; i < subjectFields.length; i++) {
                marks[i] = Integer.parseInt(subjectFields[i].getText());
            }

            // Calculate total marks and average
            int totalMarks = 0;
            for (int mark : marks) {
                totalMarks += mark;
            }
            double average = (double) totalMarks / subjectFields.length;

            // Display the result in a separate window
            JOptionPane.showMessageDialog(this,
                "Total Marks: " + totalMarks + "\n" +
                "Average Marks: " + String.format("%.2f", average),
                "Exam Result",
                JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            // Handle invalid input (non-numeric values)
            JOptionPane.showMessageDialog(this,
                "Please enter valid numeric values for marks.",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                result examResultGUI = new result();
                examResultGUI.setVisible(true);
            }
        });
    }
}
