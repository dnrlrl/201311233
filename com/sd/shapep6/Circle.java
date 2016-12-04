package com.sd.shapep6;

public class Circle extends Shape{
  private double radius, area, perimeter;
  public Circle(double radius){
    this.radius=radius;
    this.area=radius*radius*3.14;
    this.perimeter= (radius*2)*3.14;
  }
  public double calcArea(){
    return this.area;
  }
  public double calcPerimeter(){
    return this.perimeter;
  }
  public String toString(){
    return "Circle =" + super.toString();
  }
}