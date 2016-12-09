package com.sd.yut;

public class Yutroll{
  int number=0;
  public void roll(){
    number =(int)(Math.random()*5+1);
  }
  public int getNum(){
    return this.number;
  }
}