class ConvertTemperature{
  static void Convert(String sel,double tem){
    if(sel.equals("F")){
      System.out.printf("Convert C ="+(tem-32)/1.8+"C");
    }
    else{
      System.out.printf("Convert F="+((tem*1.8)+32)+"F");
    }
  }
  public static void main(String[] args){
      Convert("F",25);
  }
}
