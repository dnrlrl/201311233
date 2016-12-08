package com.sd.io;

public class PrintFile{
  public static void main(String[] args)throws FileNotFoundException{
    try{
      File f=new File("noname.txt");
      FileReader fr=new FileReader(f);
    }catch (FileNotFoundException fnfe){
      System.out.println("파일 못찾음");
    }
  }
}