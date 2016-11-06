class CountThreeFive{
  static void count(int num){
    int sum=0;
    for(int i=0; i<=num; i++){
      if(i%3==0 || i%5==0){
        sum=sum+i;
      }
    }
    System.out.println(sum);
  }
  public static void main(String[] args){
    count(1000);
  }
}
