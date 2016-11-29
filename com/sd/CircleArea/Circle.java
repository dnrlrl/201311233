package com.sd.CircleArea;

public class Circle extends Point{
  double radius;
  double area;
  public Circle(int x, int y, double radius){
    super(x,y);
    this.radius=radius;
  }
  public double getArea(){
    area =radius*radius*3.14;
    System.out.println(area);
        return area;
  }
}