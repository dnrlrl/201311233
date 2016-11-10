import java.util.ArrayList;
class Numbers{
  static int sum=0;
  static ArrayList<Integer> initialize=new ArrayList<Integer>();
  static void fourAndfive(){
    for(int i=1;i<=1000; i++){
      if(i%4==0 && i%5!=0){
        initialize.add(i);
      }
    }
    System.out.println(initialize);
  }
  static void sum(){
    for(int j=0; j<initialize.size();j++){
      sum=sum+initialize.get(j);
    }
    System.out.println("Sum= "+sum);
  }
  public static void main(String[] args){
  fourAndfive();
  sum();
  }
}
