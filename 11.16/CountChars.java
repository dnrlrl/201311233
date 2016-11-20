import java.util.HashMap;
import java.util.Map;

class CountChars{
  static void countChar(String str){
    char[] letters=str.toCharArray();
    Map<String,Integer> wc=new HashMap<String,Integer>();
    for(char c:letters){
      String i=Character.toString(c);
      if(wc.containsKey(i)){
        wc.put(i,wc.get(i)+1);
      }else{
        wc.put(i,1);
      }
    }
    System.out.println(wc);
  }
  public static void main(String[] args){
    countChar("lim is best professor");
  }
}
