package Test;

import javax.swing.*;

public class Exit {
    Exit(){
        JFrame n = new JFrame();
        n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b = new JButton("Click");
        b.setBounds(130,100,40, 40);
        n.add(b);

        n.setSize(400,400);
        n.setLayout(null);
        n.setVisible(true);
    }

    public static void main(String[] args) {
        new Exit();
    }
}
