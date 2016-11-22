package com.sd.rectangle;
public class Rectangle{
  double length;
  double width;
  boolean isSelected;
  public Rectangle(double l, double w){
    this.length=l;
    this.width=w;
  }
  public double getLength(){
    return length;
  }
  public double getWidth(){
    return width;
  }
  public void setSelected(boolean b){
    isSelected=b;
    System.out.println("Select: Rectangle");
  }
  public boolean getSelected(){
    return isSelected;
  }
    
}