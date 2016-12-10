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
  JButton more1=new JButton("ÃÊ±âÈ­");
  JButton pn1w=new JButton(" ");
  JButton pn2w=new JButton(" ");
  JButton yut19=new JButton("");
  JButton yut18=new JButton("");
  JButton yut17=new JButton("");
  JButton yut16=new JButton("");
  JButton yut15=new JButton("");
  JButton yut14=new JButton("");
  JButton yut13=new JButton("");
  JButton yut12=new JButton("");
  JButton yut11=new JButton("");
  JButton yut10=new JButton("");
  JButton yut9=new JButton("");
  JButton yut8=new JButton("");
  JButton yut7=new JButton("");
  JButton yut6=new JButton("");
  JButton yut5=new JButton("");
  JButton yut4=new JButton("");
  JButton yut3=new JButton("");
  JButton yut2=new JButton("");
  JButton yut1=new JButton("");
  JButton yut0=new JButton("");

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
    more1.addActionListener(this);
    pn1w.addActionListener(this);
    pn2w.addActionListener(this);

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
    pn.add(more1);
    pn.add(gong11);
    pn.add(gong12);
    pn.add(yut2);
    pn.add(yut14);
    pn.add(gong13);
    pn.add(pn1w);
    pn.add(pn2w);
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
      if(pn1==pn2){
        pn1w.setText("µÑÂ°ÀâÈû¤»");
      }
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
      if(pn2==pn1){
        pn2w.setText("Ã¹Â°ÀâÈû¤¾");
      }
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
    else if(e.getSource()==more1){
      yut1.setText("");
      yut2.setText("");
      yut3.setText("");
      yut4.setText("");
      yut5.setText("");
      yut6.setText("");
      yut7.setText("");
      yut8.setText("");
      yut9.setText("");
      yut10.setText("");
      yut11.setText("");
      yut12.setText(" ");
      yut13.setText(" ");
      yut14.setText(" ");
      yut15.setText(" ");
      yut16.setText(" ");
      yut17.setText(" ");
      yut18.setText(" ");
      yut19.setText(" ");
      pn1=0; 
      pn2=0;
      throw1.setText("Ã¹¹øÂ°¤¾");
      throw2.setText("µÎ¹øÂ°¤»");
    } 
    else if(e.getSource()==pn1w){
       pn1w.setText(" ");
      pn2=0;
    }
    else if(e.getSource()==pn2w){
       pn2w.setText(" ");
      pn1=0;
    }
  }



  public static void main(String[] args){
    YutGui yt=new YutGui();
    yt.setDefaultCloseOperation(EXIT_ON_CLOSE);
    yt.pack();
    yt.setVisible(true);
  }
}