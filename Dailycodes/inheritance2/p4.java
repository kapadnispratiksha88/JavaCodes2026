class Demo {
    int x=10;
    static int y=20;
    Demo(){
        System.out.println("Demo contructpr");
    }
    static{
        System.out.println("static block");
    }
    void fun(){
        System.out.println("in gun");
    }
    static void gun(){
        System.out.println("inn fun");
    }
}
class Demochild extends Demo{
    Demochild(){
    System.out.println("Demo child constructor");
    }

}
class Client{
    public static void main(String[] args) {
        
    
    Demo obj =new Demo();
    obj.fun();
    obj.gun();
    System.out.println(obj.x);
    System.out.println(obj.y);
    

    }

}