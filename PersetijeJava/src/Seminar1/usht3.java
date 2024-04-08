// Krijoni një aplikacion në JAVA që mban një label, një textField dhe një buton. Vlera fillestare e
//textField është 0. Sa herë klikoni në buton, vlera e textField rritet me një.
package Seminar1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class usht3 {
    public static void main(String [] args){
        JFrame frame = new JFrame ("numero");
        JPanel p = new JPanel();
        JTextField tf = new JTextField("0", 10);
        JButton btn = new JButton("Rrit me nje");
        btn.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               int vlera = Integer.parseInt(tf.getText());
               vlera++;
               tf.setText(Integer.toString(vlera));
           }
        });
        p.add(tf);
        p.add(btn);
        frame.add(p);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}