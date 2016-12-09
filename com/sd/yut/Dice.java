package com.sd.yut;
import com.sd.yut.*;
class Dice{
  private int number=0;
  public int roll(){
    number = (int)(Math.random()*6+1);
    System.out.println("Turn on "+number);
    return number;
  }
    public static void main(String[] args){
  }
}