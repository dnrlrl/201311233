package com.sd.io;

public class WriteFile{
  public static void main(String[] args){
    FileWriter fw=new FileWriter("test.txt");
    fw.write("test");
    fw.close();
  }
}