class Demo {
    Demo(){
        System.out.println("constructor1");
    }
    
    void fun(){
        System.out.println("In fun");
    }   
}
    class Memo{
        Memo(){
        System.out.println("constructor2");
        }
    void fun(){
        System.out.println("In fun");
    }
}
class Client{
    public static void main(String[] args) {
        Demo obj1=new Demo();
        obj1.fun();
        
        Memo obj2=new Memo();
        obj2.fun();

    }
}
