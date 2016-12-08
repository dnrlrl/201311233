package com.sd.io;

import java.util.Scanner;

public class ScannerFile{
  public static void main(String[] args) throws Exception{
    Scanner f=new Scanner(new File("test.txt"));
    String line = f.nextLine();
    System.out.println(line);
  }
}