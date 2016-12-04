class Hello{
  private String name;
  public Hello(String name){
    this.name=name;
  }
  public void sayHello(){
    System.out.println("Hello "+name);
  }
  public static void main(String[] args){
    Hello[] h=new Hello[5];
    h[0] =new Hello("sw1");
    h[1] =new Hello("sw2");
    h[2] =new Hello("sw3");
    h[3] =new Hello("sw4");
    h[4] =new Hello("sw5");
    for(Hello e:h)
      e.sayHello();
  }
}
