package seminar4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Sem4ush3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MenuBar");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("Menu1");
        JMenu menu2 = new JMenu("Menu2");
        JMenu menu3 = new JMenu("Menu3");

        JMenuItem exitItem = new JMenuItem("Exit");
        JMenuItem  testItem = new JMenuItem("test");

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menu1.add(testItem);
        menu3.add(exitItem);
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
        
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}
