class ReverseChar{
  static void reverseC(){
    String hello="hello";
    char[] chArr=hello.toCharArray();
    StringBuilder olleh=new StringBuilder();
    for(int i=chArr.length-1;i>=0;i--)
      olleh.append(chArr[i]);
    System.out.println(olleh);
  }
  public static void main(String[] args){
    reverseC();
  }
}