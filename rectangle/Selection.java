package com.sd.rectangle;
class Selection{
  public void select(Rectangle r){
    r.setSelected(true);
    System.out.println("selecte: "+r.isSelected);
  }
    
  public static void main(String[] args){
    Rectangle r1 = new Rectangle(10,20);
    Cube c1 = new Cube(11.0,21.0,31.0);
    Selection s = new Selection();
    s.select(r1);
    s.select(c1);
  }
}