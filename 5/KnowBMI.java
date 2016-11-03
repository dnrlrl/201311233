class KnowBMI{
  static void computeBMI(double w,double h){
    double bmi= w/(h*h);
    System.out.println("BMI="+bmi);
    if(bmi<18.5){
      System.out.println("low");
    }
    else if(bmi>=18.5 && bmi<=22.9){
      System.out.println("normal");
    }
    else if(bmi>=23.0 && bmi<=24.9){
      System.out.println("risky");
    }
    else if(bmi>=25.0 && bmi<=29.9){
      System.out.println("obesity 1");
    }
    else if(bmi>=30.0 && bmi<=39.9){
      System.out.println("obesty 2");
    }
    else if(bmi>=40.0){
      System.out.println("obesty 3");
    }
    else{
      System.out.println("erroe");
    }
  }
  public static void main(String[] args){
    computeBMI(70.0,1.8);
  }
}
