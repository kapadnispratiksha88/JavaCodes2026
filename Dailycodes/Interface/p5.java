interface Demo{
    int x=10;
    default void fun(){
      System.out.println("in default Demo");
    
    }
    static void gun(){
      System.out.println("in default Demo");
    
    }
}
class Demochild implements Demo{
    void fun(){
      System.out.println("in default DemoChild");
    
    }
    public static void main (String[] args){
        Demo obj=new Demochild();
        obj.fun();

    }
}