public class Player{
  private String name=null;
  private int sum=0;
  private int first=0;
  private int second=0;
  public Player(String _name){
    name=_name;
  }
  public void play(){
    Dice d=new Dice();
    d.roll();
    first=getNum();
    System.out.println("one more please!"+first);
    Dice d=new Dice();
    d.roll();
    second=getNum();
    System.out.println(second);
    sum=first+second;
  }
  public String getName(){
    return this.name;
  }
  public int getNum(){
    return this.sum;
  }
}
