class DrawTriangleWithChar{
  static void drawTrinangleWithChar(int height,String symbol){
    StringBuffer sbuf=new StringBuffer();
    String white=" ";
    for(int i=0; i<height; i++){
      for(int j=1; j < height-i; j++){
        sbuf.append(white);
        
      }
      System.out.print(sbuf.toString());
      sbuf.delete(0,sbuf.length());
      for(int k=0; k<i*2+1; k++){
        sbuf.append(symbol);
      }
      System.out.println(sbuf.toString());
      sbuf.delete(0,sbuf.length());
    }
  }
  public static void main(String[] args){
    drawTrinangleWithChar(10,"*");
  }
}
