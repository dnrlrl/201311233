class ChangeGrade{
  static void computeGrade(double marks){
    if(90<=marks && marks<=100){
      System.out.println("grade is A");
    }
    else if(80<=marks && marks<90){
      System.out.println("grade is B");
    }
    else if(70<=marks && marks<80){
      System.out.println("grade is C");
    }
    else if(60<=marks && marks<70){
      System.out.println("grade is D");
    }
    else
      System.out.println("grade is F");
  }
  public static void main(String[] args){
    computeGrade(70.2);
  }
}
