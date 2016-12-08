package com.sd.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.String;

public class  BufferedReaderLower{
  public static void main(String[] args){
    try{
      File f=new File("test.txt");
      FileReader fr = new FileReader(f); 
      BufferedReader br = new BufferedReader(fr); 
      String s; 
      while((s = br.readLine()) != null) { 
        System.out.println(s.toLowerCase()); 
      } 
      fr.close();
    }catch(Exception e){
      System.out.println("오류 발생");
    }
  }
}