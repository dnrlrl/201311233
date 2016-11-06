class LeafYear{
  static void leapYear(int[] year){
    for(int i=0;i<year.length;i++){
    if(((year[i]%4 ==0)&&(year[i]%100 !=0))||(year[i]%400==0)){
      System.out.println(year[i] +" A leap year");
    }
    else{
      System.out.println(year[i]+" Not a leap year");
    }
    }
  }
  public static void main(String[] args){
    int[] years={1800,1900,1912,1984,1985,2000,2015,1825,1928,2031,1845,1947,2053,2099};
    leapYear(years);
  }
}
