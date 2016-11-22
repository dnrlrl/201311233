package com.sd.rectangle;
class Cube extends Rectangle{
  double height;
  public Cube(double l,double w, double h){
    super(l,w);                            
    this.height=h;
  }
  public double getHeight(){
    return height;
  }
  public void setSelected(boolean b){
    isSelected=b;
    System.out.println("Select is: Cube");
  }
  public boolean getSelected(){
    return isSelected;
  }

}