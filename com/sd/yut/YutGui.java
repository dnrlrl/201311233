package com.sd.yut;

import com.sd.yut.*;
import javax.swing.*;
import java.awt.Container;
import java.awt.event.*;
import java.awt.GridLayout;


public class YutGui extends JFrame implements ActionListener{
  int number;
  int number2;
  int pn1=0;
  int pn2=0;
  JButton throw1=new JButton("첫번째ㅎ");
  JButton throw2=new JButton("두번째ㅋ");
  JButton more1=new JButton("다시할꺼다!");
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
    setTitle("윷놀이당");
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
    yut1.addActionListener(this);
    yut2.addActionListener(this);
    yut3.addActionListener(this);
    yut4.addActionListener(this);
    yut5.addActionListener(this);
    yut6.addActionListener(this);
    yut7.addActionListener(this);
    yut8.addActionListener(this);
    yut9.addActionListener(this);
    yut10.addActionListener(this);
    yut11.addActionListener(this);
    yut12.addActionListener(this);
    yut13.addActionListener(this);
    yut14.addActionListener(this);
    yut15.addActionListener(this);
    yut16.addActionListener(this);
    yut17.addActionListener(this);
    yut18.addActionListener(this);
    yut19.addActionListener(this);
    setSize(3000,3000);

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
        pn1w.setText("둘째잡았다ㅋ");
      }
      if(pn1==1){
        yut1.setText("첫째");
      }
      if(pn1==2){
        yut2.setText("첫째");
      }  
      if(pn1==3){
        yut3.setText("첫째");
      }
      if(pn1==4){
        yut4.setText("첫째");
      }
      if(pn1==5){
        yut5.setText("첫째");
      }
      if(pn1==6){
        yut6.setText("첫째");
      }
      if(pn1==7){
        yut7.setText("첫째");
      }
      if(pn1==8){
        yut8.setText("첫째");
      }
      if(pn1==9){
        yut9.setText("첫째");
      }
      if(pn1==10){
        yut10.setText("첫째");
      }
      if(pn1==11){
        yut11.setText("첫째");
      }
      if(pn1==12){
        yut12.setText("첫째");
      }
      if(pn1==13){
        yut13.setText("첫째");
      }
      if(pn1==14){
        yut14.setText("첫째");
      }
      if(pn1==15){
        yut15.setText("첫째");
      }
      if(pn1==16){
        yut16.setText("첫째");
      }
      if(pn1==17){
        yut17.setText("첫째");
      }
      if(pn1==18){
        yut18.setText("첫째");
      }
      if(pn1==19){
        yut19.setText("첫째");
      }      


      if(pn1>=20){
        throw1.setText("이겼당");
      }
    }else if(e.getSource()==throw2){
      Yutroll y= new Yutroll();
      y.roll();
      pn2=pn2+y.getNum();
      if(pn2==pn1){
        pn2w.setText("첫째잡았다ㅎ");
      }
      if(pn2==1){
        yut1.setText("둘째");
      }
      if(pn2==2){
        yut2.setText("둘째");
      }
      if(pn2==3){
        yut3.setText("둘째");
      }
      if(pn2==4){
        yut4.setText("둘째");
      }
      if(pn2==5){
        yut5.setText("둘째");
      }
      if(pn2==6){
        yut6.setText("둘째");
      }
      if(pn2==7){
        yut7.setText("둘째");
      }
      if(pn2==8){
        yut8.setText("둘째");
      }
      if(pn2==9){
        yut9.setText("둘째");
      }
      if(pn2==10){
        yut10.setText("둘째");
      }
      if(pn2==11){
        yut11.setText("둘째");
      }
      if(pn2==12){
        yut12.setText("둘째");
      }
      if(pn2==13){
        yut13.setText("둘째");
      }
      if(pn2==14){
        yut14.setText("둘째");
      }
      if(pn2==15){
        yut15.setText("둘째");
      }
      if(pn2==16){
        yut16.setText("둘째");
      }
      if(pn2==17){
        yut17.setText("둘째");
      }
      if(pn2==18){
        yut18.setText("둘째");
      }
      if(pn2==19){
        yut19.setText("둘째");
      }
      if(pn2>=20){
        throw2.setText("이겼당");
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
      throw1.setText("첫번째ㅎ");
      throw2.setText("두번째ㅋ");
    } 
    else if(e.getSource()==pn1w){
       pn1w.setText(" ");
      pn2=0;
    }
    else if(e.getSource()==pn2w){
       pn2w.setText(" ");
      pn1=0;
    }
    else if(e.getSource()==yut1){
      yut1.setText("");
    }
    else if(e.getSource()==yut2){
      yut2.setText("");
    }
    else if(e.getSource()==yut3){
      yut3.setText("");
    }
    else if(e.getSource()==yut4){
      yut4.setText("");
    }
    else if(e.getSource()==yut5){
      yut5.setText("");
    }
    else if(e.getSource()==yut6){
      yut6.setText("");
    }
    else if(e.getSource()==yut7){
      yut7.setText(" ");
    }
    else if(e.getSource()==yut8){
      yut8.setText(" ");
    }
    else if(e.getSource()==yut9){
      yut9.setText(" ");
    }
    else if(e.getSource()==yut10){
      yut10.setText(" ");
    }
    else if(e.getSource()==yut11){
      yut11.setText(" ");
    }
    else if(e.getSource()==yut12){
      yut12.setText(" ");
    }
    else if(e.getSource()==yut13){
      yut13.setText(" ");
    }
    else if(e.getSource()==yut14){
      yut14.setText(" ");
    }
    else if(e.getSource()==yut15){
      yut15.setText(" ");
    }
    else if(e.getSource()==yut16){
      yut16.setText(" ");
    }
    else if(e.getSource()==yut17){
      yut17.setText(" ");
    }
    else if(e.getSource()==yut18){
      yut18.setText(" ");
    }
    else if(e.getSource()==yut19){
      yut19.setText(" ");
    }

  }



  public static void main(String[] args){
    YutGui yt=new YutGui();
    yt.setDefaultCloseOperation(EXIT_ON_CLOSE);
    yt.pack();
    yt.setVisible(true);
  }
}