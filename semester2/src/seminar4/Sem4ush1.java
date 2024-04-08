package seminar4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Sem4ush1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel statusLabel = new JLabel("Status:");
        frame.add(statusLabel, BorderLayout.SOUTH);

        frame.addMouseListener(new MouseAdapter() {
      
            public void mouseClicked(MouseEvent e) {
                statusLabel.setText("Mouse Clicked ne (" + e.getX() + ", " + e.getY() + ")");
            }        
            public void mousePressed(MouseEvent e) {
                statusLabel.setText("Mouse Pressed ne (" + e.getX() + ", " + e.getY() + ")");
            }
            public void mouseReleased(MouseEvent e) {
                statusLabel.setText("Mouse Exit ne (" + e.getX() + ", " + e.getY() + ")");
            }
            public void mouseEntered(MouseEvent e) {
                statusLabel.setText("mouse Entered ne (" + e.getX() + ", " + e.getY() + ")");
            }          
            public void mouseExited(MouseEvent e) {
                statusLabel.setText(" Mouse Exited ne (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        frame.setVisible(true);
    }
}
