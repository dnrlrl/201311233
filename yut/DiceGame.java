package com.sd.yut;

import com.sd.yut.*;
class DiceGame{
  public static void main(String[] args){
    Player p1=new Player("A");
    Player p2=new Player("B");
    p1.play();
    p2.play();
    if(p1.getNum() > p2.getNum()){
      System.out.println(p1.getName()+"won");
    }
    else if(p1.getNum()==p2.getNum()){
      System.out.println("draw");
    }
    else
    System.out.println(p2.getNum()+"won");
    }
}