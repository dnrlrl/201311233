import java.util.*;
class Student{
  private String name;
  private int studentNum;
  Student(String name, int sNum){
    this.name=name;
    this.studentNum=sNum;
  }
  public String getName(){
    return name;
  }
  public static void arrayStudents(){
    ArrayList<String> str= new ArrayList<String>();
    Student s1 = new Student("lsw",1);
    Student s2 = new Student("bsh",2);
    str.add(s1.getName());
    str.add(s2.getName());
    Collections.sort(str);
    System.out.println(str);
  }
  public static void main(String[] args){
    arrayStudents();
  }
}
