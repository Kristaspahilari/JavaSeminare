package Seminar3;
//Krijoni një aplikacion në JAVA që merr nga përdoruesi në një textField një numër. Në
//klik të një butoni tregoni nëse numri është pozitiv apo negativ.
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ush1 {
    public static void main(String[] args){
        JFrame f = new JFrame ("Numer pozitiva po negativ");
        JPanel p = new JPanel();
        JTextField tf = new JTextField(10);
        JLabel lbl = new JLabel();
        JButton btn = new JButton("Kontrollo");
        btn.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               int nr = Integer.parseInt(tf.getText());
               if(nr<0){
                   lbl.setText("negativ");
               } else if (nr>0) {
                   lbl.setText("pozitiv");
               }
               else{lbl.setText("zero");}


           }
        });
        p.add(tf);
        p.add(btn);
        p.add(lbl);
        f.add(p);
        f.setVisible(true);
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
