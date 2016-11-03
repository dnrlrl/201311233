class RockScissorPaper{
  static void rspPlay(String u1,String u2){
    if (u1.equals(u2)){
      System.out.println("Draw");
    }
    else if(u1.equals("scissor")){
      if(u2.equals("rock")){
        System.out.println("rock Wins");
      }
      if(u2.equals("paper")){
        System.out.println("scissor Wins");
      }
    }
    else if(u1.equals("rock")){
      if(u2.equals("scissor")){
        System.out.println("rock Wins");
      }
      if(u2.equals("paper")){
        System.out.println("paper Wins");
      }
    }
    else if(u1.equals("paper")){
      if(u2.equals("scissor")){
        System.out.println("scissor Wins");
      }
      if(u2.equals("rock")){
        System.out.println("paper Wins");
      }
    }
  }
  public static void main(String[] args){
    String u1= "rock";
    String u2= "paper";
    rspPlay(u1,u2);
  }
}
