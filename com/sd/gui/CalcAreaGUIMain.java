package com.sd.gui;

import javax.swing.*;
import java.awt.*;

public class CalcAreaGUIMain{
  public static void main(String[] args){
    JFrame f=new JFrame();
    JPanel panel=new JPanel(new GridLayout(3,2));
    f.getContentPane().add(panel);
    JLabel label1=new JLabel("반지름");
    JTextField radiusTf1=new JTextField(10);
    JTextField areaTf2=new JTextField(20);
    JLabel label2=new JLabel("넓이");
    f.setSize(1000,1000);
    JButton b1=new JButton("계산");
    JButton b2=new JButton("취소");
    panel.add(label1);
    panel.add(radiusTf1);
    panel.add(label2);
    panel.add(areaTf2);
    panel.add(b1);
    panel.add(b2);
    f.pack();
    f.setVisible(true);
  } 
}