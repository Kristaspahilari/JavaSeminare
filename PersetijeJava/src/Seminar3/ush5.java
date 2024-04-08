package Seminar3;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ush5 {
    public static void main(String[] args){
        JFrame f = new JFrame ("Shto dhe hiq");
        JPanel p= new JPanel();
        JTextField tf= new JTextField("0", 10);
        JButton btnShto = new JButton("Shto nje");
        JButton btnHiq = new JButton("hiq nje");
        JButton btnGjF = new JButton("Gjendje Fillestare");
        tf.setEditable(false);
        ActionListener b = new ActionListener(){
            public void actionPerformed(ActionEvent e ){
                int num = Integer.parseInt(tf.getText());
                if(e.getSource()==btnShto){
                    num++;
                }
                else if(e.getSource()==btnHiq){
                    num--;
                }
                else if(e.getSource()==btnGjF){
                    num=0;

                }
                tf.setText(Integer.toString(num));
            }

            };
        btnShto.addActionListener(b);
        btnHiq.addActionListener(b);
        btnGjF.addActionListener(b);
        p.add(tf);
        p.add(btnShto);
        p.add(btnHiq);
        p.add(btnGjF);
        f.add(p);
        p.setSize(300,300);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
