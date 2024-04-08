package seminar4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sem4ush4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Programim ne JAVA, Seminar, Kliko me maus me te djathten");
        panel.add(label);
        JPopupMenu popupMenu = new JPopupMenu();
       
        ButtonGroup opsionet = new ButtonGroup();
        JRadioButtonMenuItem boldItem = new JRadioButtonMenuItem("Bold");
        JRadioButtonMenuItem italicItem = new JRadioButtonMenuItem("Italic");
        JRadioButtonMenuItem boldItalicItem = new JRadioButtonMenuItem("Bold Italic");
        
        opsionet.add(boldItem);
        opsionet.add(italicItem);
        opsionet.add(boldItalicItem); 

        popupMenu.add(boldItem);
        popupMenu.add(italicItem);
        popupMenu.add(boldItalicItem);
        boldItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setFont(label.getFont().deriveFont(Font.BOLD));
            }
        });

        italicItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setFont(label.getFont().deriveFont(Font.ITALIC));
            }
        });
        boldItalicItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setFont(label.getFont().deriveFont(Font.BOLD | Font.ITALIC));
            }
        });
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                if (evt.isPopupTrigger()) {
                    popupMenu.show(evt.getComponent(), evt.getX(), evt.getY());
                }
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                if (evt.isPopupTrigger()) {
                    popupMenu.show(evt.getComponent(), evt.getX(), evt.getY());
                }
            }
        });

    
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
