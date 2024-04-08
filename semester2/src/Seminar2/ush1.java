package Seminar2;
import java.awt.*;
import java.awt.event.*;
public class ush1{
    public static void main(String[] args){
      Frame frame = new Frame ("frame i pare");
      Label label = new Label("helLo World", Label.CENTER);
      frame.add(label);
      frame.setSize(400,400);
      frame.setVisible(true);
      frame.addWindowListener(new WindowAdapter(){
         public void windowClosing(WindowEvent w){
         System.exit(0);
         }
      }
    );
}}