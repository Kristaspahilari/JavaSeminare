package Seminar1;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ush4 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Mbledhje numrash");
        JPanel p = new JPanel();
        JLabel l1 = new JLabel("Jep nje numer");
        JTextField tf1 = new JTextField(10);
        JLabel l2 = new JLabel("Shuma: ");
        JTextField tf2 = new JTextField("0", 10);
        tf2.setEditable(false);

        tf1.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
                // Implementation not needed for this method
            }

            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                        int nr = Integer.parseInt(tf1.getText());
                        int currentSum = Integer.parseInt(tf2.getText());
                        int shuma = nr + currentSum;
                        tf2.setText(Integer.toString(shuma));


                }
            }

            public void keyReleased(KeyEvent e) {
                // Implementation not needed for this method
            }
        });

        p.add(l1);
        p.add(tf1);
        p.add(l2);
        p.add(tf2);
        f.add(p);
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

