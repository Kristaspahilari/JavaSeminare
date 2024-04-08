
package Seminar1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// merr nga përdoruesi nëpërmjet një textField emrin e tij, dhe në
//klikim të një butoni e afishon atë në një label.
public class ush2 {
    public static void main(String [] args){
        JFrame frame = new JFrame ("Frame");
        JPanel panel = new JPanel();
        JTextField tf = new JTextField(20);
        JButton btn = new JButton("Afisho emrin ne label");
        JLabel lbl = new JLabel ();
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String emri= tf.getText();
                lbl.setText(emri);
            }
        });
        panel.add(lbl);
        panel.add(tf);
        panel.add(btn);
        frame.add(panel);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

}
