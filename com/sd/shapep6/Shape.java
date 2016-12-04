package com.sd.shapep6;

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
    
    
    if(r instanceof Shape && r instanceof Rectangle) {
      System.out.print(r.toString());
    }
    if(c instanceof Shape && c instanceof Circle) {
      System.out.print(r.toString());
    }
    Shape[] s =new Shape[2];
    s[0]=r;
    s[1]=c;
    for(Shape my : s) {
      if(my instanceof Rectangle) {
        System.out.println(my.toString());
      } else if(my instanceof Circle) {
        System.out.println(my.toString());
      }
    }
    for(Shape my : s){
      System.out.println(my.toString());
	}
    
  
  }
}
