package com.sd.SLTurtle;

public class Turtle{
  int nLimbs=4;
  String food;
  public void setFood(String f){
    this.food=f;
  }
  public void eat(){
    System.out.println("Turtle eats "+food);
  }
  public static void main(String[] args){
  Turtle t= new Turtle();
  SeaTurtle st= new SeaTurtle();
  LandTurtle lt= new LandTurtle();
  st.swim();
  t.setFood("seaweed");
  t.eat();
  lt.walk();
  t.setFood("grass");
  t.eat();
  }
}