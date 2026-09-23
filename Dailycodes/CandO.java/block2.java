 class Demo {
  int x=20;
  static{
    System.out.println("static block1");

  }  
  {
    System.out.println("instance block1");

  }
 static  {
    System.out.println("static block 2");
  }
  
  Demo(){
    System.out.println("Demo constructor");
  }
  public static void main(String[] args) {
    Demo obj=new Demo();

  }

}
