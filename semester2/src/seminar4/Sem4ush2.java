package seminar4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Sem4ush2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Kordinatat e mouse");
        frame.setSize(450, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel xLabel = new JLabel("Kordinata X:");
        JTextField xField = new JTextField(5);
        JLabel yLabel = new JLabel("Kordinata Y:");
        JTextField yField = new JTextField(5);
        xField.setEditable(false);
        yField.setEditable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(xLabel);
        panel.add(xField);
        panel.add(yLabel);
        panel.add(yField);

        frame.add(panel);

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                xField.setText(Integer.toString(e.getX()));
                yField.setText(Integer.toString(e.getY()));
            }
        });

        frame.setVisible(true);
        
    }
}
