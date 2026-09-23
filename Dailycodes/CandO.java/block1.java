class Demo {
    
    {
        System.out.println("instance block");
    }
    Demo(){
        System.out.println("Demo constructor");
    }
    {
      System.out.println("instance block2");  
    }
    public static void main(String[] args) {
        Demo obj =new Demo();
        

    }
}
