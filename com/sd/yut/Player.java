package com.sd.yut;
import com.sd.yut.*;
public class Player extends Dice{
  String name=null;
  int num=0;
  public Player(String _name){
    name= _name;
  }
  public int play(){
    Dice d=new Dice();
    num=d.roll();
    System.out.println(num);
    return num;
    }
  public String getName(){
    return this.name;
  }
  public int getNum(){
    return this.num;
  }
  public static void main(String[] args){
  }
}