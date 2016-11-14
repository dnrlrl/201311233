import ch.aplu.turtle.*;
import java.util.ArrayList;
class Track{
    static void tracks(int size, double x, double y){
      Turtle t1=new Turtle();
      Double[] pos=new Double[2];
      pos[0]=t1.getX();
      pos[0]=x;
      pos[1]=t1.getY();
      pos[1]=y;
      ArrayList<Double[]> posArr=new ArrayList<Double[]>();
      for(int i=0; i<4; i++){
        pos[0]=t1.getX();
        pos[1]=t1.getY();
        posArr.add(pos);
        t1.forward(100);
        t1.right(90);
      }
      posArr.add(pos);
      for(Double[] d:posArr){
        System.out.printf("(%.1f,%.1f)",d[0],d[1]);
      }
    }
  public static void main(String[] args){
    tracks(100,10.0,20.0);
  }
}