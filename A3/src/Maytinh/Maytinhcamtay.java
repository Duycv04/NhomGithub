/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maytinh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Maytinhcamtay extends JFrame implements ActionListener {

    private JTextField textField;
    private JButton[] numberButtons;
    private JButton addButton, equalButton, Delete, tru, nhan, chia;
    private JLabel resultLabel;
    private double num1 = 0, num2 = 0, result = 0;
    private String lc;

    public Maytinhcamtay() {
        setTitle("May Tinh");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);
        textField = new JTextField();
        textField.setBounds(10, 10, 270, 50);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }
        addButton = new JButton("+");
        addButton.addActionListener(this);
        tru = new JButton("-");
        tru.addActionListener(this);
        nhan = new JButton("*");
        nhan.addActionListener(this);
        chia = new JButton("/");
        chia.addActionListener(this);
        equalButton = new JButton("=");
        equalButton.addActionListener(this);
        Delete = new JButton("<-");
        Delete.addActionListener(this);
        resultLabel = new JLabel();
        resultLabel.setBounds(10, 70, 270, 50);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 20));
        JPanel panel = new JPanel();
        panel.setBounds(10, 130, 270, 220);
        panel.setLayout(new GridLayout(4, 3, 10, 10));
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(addButton);
        panel.add(tru);
        panel.add(nhan);
        panel.add(chia);
        panel.add(equalButton);
        panel.add(Delete);
        panel.add(numberButtons[0]);

        add(textField);
        add(resultLabel);
        add(panel);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Maytinhcamtay();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText()+i);
            }
        }
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textField.getText());
            lc = "+";
            textField.setText("");
        }
        if (e.getSource() == tru) {
            num1 = Double.parseDouble(textField.getText());
            lc = "-";
            textField.setText("");
        }
        if (e.getSource() == nhan) {
            num1 = Double.parseDouble(textField.getText());
            lc = "*";
            textField.setText("");
        }
        if (e.getSource() == chia) {
            num1 = Double.parseDouble(textField.getText());
            lc = "/";
            textField.setText("");
        }
        if (e.getSource() == Delete) {
            textField.setText("");
            resultLabel.setText("");
        }
        if (e.getSource() == equalButton) {
            num2 = Double.parseDouble(textField.getText());
            switch (lc) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }
            resultLabel.setText(String.valueOf("="+result));
        }
    }
}
