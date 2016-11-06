import java.util.Calendar;
class CountSunday{
  static int sun=0;
  static void countsun(){
    Calendar c = Calendar.getInstance();
    for(int y=1901;y<=2000;y++){
      for(int m=0;m<12;m++){
        c.set(y,m,1);
        if(c.get(Calendar.DAY_OF_WEEK)==1){
        sun++;
       }
      }
    }
    System.out.println(sun);
  }
  public static void main(String[] args){
    countsun();
  }
}
