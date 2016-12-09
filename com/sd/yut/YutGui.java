package com.sd.yut;

import com.sd.yut.*;
import javax.swing.*;
import java.awt.Container;
import java.awt.event.*;
import java.awt.*;


public class YutGui extends JFrame implements ActionListener{
  int number;
  int number2;
  int pn1=0;
  int pn2=0;
  JButton throw1=new JButton("Ã¹¹øÂ°¤¾");
  JButton throw2=new JButton("µÎ¹øÂ°¤»");
  JButton yut19=new JButton("19");
  JButton yut18=new JButton("18");
  JButton yut17=new JButton("17");
  JButton yut16=new JButton("16");
  JButton yut15=new JButton("15");
  JButton yut14=new JButton("14");
  JButton yut13=new JButton("13");
  JButton yut12=new JButton("12");
  JButton yut11=new JButton("11");
  JButton yut10=new JButton("10");
  JButton yut9=new JButton("9");
  JButton yut8=new JButton("8");
  JButton yut7=new JButton("7");
  JButton yut6=new JButton("6");
  JButton yut5=new JButton("5");
  JButton yut4=new JButton("4");
  JButton yut3=new JButton("3");
  JButton yut2=new JButton("2");
  JButton yut1=new JButton("1");
  JButton yut0=new JButton("0");

  public YutGui(){
    setTitle("À·³îÀÌ´ç");
    setSize(1000,1000);
    GridLayout g=new GridLayout(6,6);
    g.setHgap(5);
    g.setVgap(5);
    JPanel pn=new JPanel();
    pn.setLayout(g);
    getContentPane().add(pn);
    throw1.addActionListener(this);
    throw2.addActionListener(this);

    JLabel gong1=new JLabel(" ");
    JLabel gong2=new JLabel(" ");
    JLabel gong3=new JLabel(" ");
    JLabel gong4=new JLabel(" ");
    JLabel gong5=new JLabel(" ");
    JLabel gong6=new JLabel(" ");
    JLabel gong7=new JLabel(" ");
    JLabel gong8=new JLabel(" ");
    JLabel gong9=new JLabel(" ");
    JLabel gong10=new JLabel(" ");
    JLabel gong11=new JLabel(" ");
    JLabel gong12=new JLabel(" ");
    JLabel gong13=new JLabel(" ");
    JLabel gong14=new JLabel(" ");
    JLabel gong15=new JLabel(" ");
    JLabel gong16=new JLabel(" ");

    pn.add(yut10);
    pn.add(yut9);
    pn.add(yut8);
    pn.add(yut7);
    pn.add(yut6);
    pn.add(yut5);
    pn.add(yut11);
    pn.add(gong1);
    pn.add(gong2);
    pn.add(gong3);
    pn.add(gong4);
    pn.add(yut4);
    pn.add(yut12);
    pn.add(gong5);
    pn.add(throw1);
    pn.add(throw2);
    pn.add(gong8);
    pn.add(yut3);
    pn.add(yut13);
    pn.add(gong9);
    pn.add(gong10);
    pn.add(gong11);
    pn.add(gong12);
    pn.add(yut2);
    pn.add(yut14);
    pn.add(gong13);
    pn.add(gong14);
    pn.add(gong15);
    pn.add(gong16);
    pn.add(yut1);
    pn.add(yut15);
    pn.add(yut16);
    pn.add(yut17);
    pn.add(yut18);
    pn.add(yut19);
    pn.add(yut0);
    pack();
    setVisible(true);
  }
  public void actionPerformed(ActionEvent e){
    if(e.getSource()==throw1){
      Yutroll y= new Yutroll();
      y.roll();
      pn1=pn1+y.getNum();
      if(pn1==1){
        yut1.setText("pn1");
      }
      if(pn1==2){
        yut2.setText("pn1");
      }
      if(pn1==3){
        yut3.setText("pn1");
      }
      if(pn1==4){
        yut4.setText("pn1");
      }
      if(pn1==5){
        yut5.setText("pn1");
      }
      if(pn1==6){
        yut6.setText("pn1");
      }
      if(pn1==7){
        yut7.setText("pn1");
      }
      if(pn1==8){
        yut8.setText("pn1");
      }
      if(pn1==9){
        yut9.setText("pn1");
      }
      if(pn1==10){
        yut10.setText("pn1");
      }
      if(pn1==11){
        yut11.setText("pn1");
      }
      if(pn1==12){
        yut12.setText("pn1");
      }
      if(pn1==13){
        yut13.setText("pn1");
      }
      if(pn1==14){
        yut14.setText("pn1");
      }
      if(pn1==15){
        yut15.setText("pn1");
      }
      if(pn1==16){
        yut16.setText("pn1");
      }
      if(pn1==17){
        yut17.setText("pn1");
      }
      if(pn1==18){
        yut18.setText("pn1");
      }
      if(pn1==19){
        yut19.setText("pn1");
      }


      if(pn1>=20){
        throw1.setText("½Â¸®");
      }
    }else if(e.getSource()==throw2){
      Yutroll y= new Yutroll();
      y.roll();
      pn2=pn2+y.getNum();
      if(pn2==1){
        yut1.setText("pn2");
      }
      if(pn2==2){
        yut2.setText("pn2");
      }
      if(pn2==3){
        yut3.setText("pn2");
      }
      if(pn2==4){
        yut4.setText("pn2");
      }
      if(pn2==5){
        yut5.setText("pn2");
      }
      if(pn2==6){
        yut6.setText("pn2");
      }
      if(pn2==7){
        yut7.setText("pn2");
      }
      if(pn2==8){
        yut8.setText("pn2");
      }
      if(pn2==9){
        yut9.setText("pn2");
      }
      if(pn2==10){
        yut10.setText("pn2");
      }
      if(pn2==11){
        yut11.setText("pn2");
      }
      if(pn2==12){
        yut12.setText("pn2");
      }
      if(pn2==13){
        yut13.setText("pn2");
      }
      if(pn2==14){
        yut14.setText("pn2");
      }
      if(pn2==15){
        yut15.setText("pn2");
      }
      if(pn2==16){
        yut16.setText("pn2");
      }
      if(pn2==17){
        yut17.setText("pn2");
      }
      if(pn2==18){
        yut18.setText("pn2");
      }
      if(pn2==19){
        yut19.setText("pn2");
      }
      if(pn2>=20){
        throw2.setText("½Â¸®");
      }
    }  
  }



  public static void main(String[] args){
    YutGui yt=new YutGui();
    yt.setDefaultCloseOperation(EXIT_ON_CLOSE);
    yt.pack();
    yt.setVisible(true);
  }
}