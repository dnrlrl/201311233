package com.sd.CircleArea;
public class Point{
  int x;
  int y;
  public Point(int x, int y){
    this.x=x;
    this.y=y;
  }
  public static void main(String[] args){
    Circle c=new Circle(10,10,10.0);
    c.getArea();
  }    
}
