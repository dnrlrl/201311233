package com.sd.shape;

public abstract class Shape{
  public String name="Shape";
  public abstract double calcArea();
  public abstract double calcPerimeter();
  public String getName(){return this.name;}
  public String toString(){
    return "Shape..."+super.toString();
  }
  public static void main(String[] args){
    Rectangle r=new Rectangle(5.0,3.0);
    Circle c=new Circle(5.0);
    System.out.println("R.area = "+r.calcArea()+" r.perimeter= "+ r.calcPerimeter());
    System.out.println("C.area = "+c.calcArea()+" c.perimeter= "+ c.calcPerimeter());
  }
}
