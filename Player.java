public class Player{
  private String name=null;
  int num=0;
  public Player(String _name){
    name= _name;
  }
  public int play(){
    Dice d=new Dice();
    num=d.roll();
    System.out.println(num);
    return num;
    }
  public String getName(){
    return this.name;
  }
  public int getNum(){
    return this.num;
  }
}
