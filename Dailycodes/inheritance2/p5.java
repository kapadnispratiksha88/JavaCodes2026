class Demo {
    int x=10;
    static int y=20;
    Demo(){
        System.out.println("Demo contructpr");
    }
    void fun(){
        System.out.println("in gun");
    }
    static void gun(){
        System.out.println("inn fun");
    }
    static{
        System.out.println("**************");
    }
}
class Demochild extends Demo{
    Demochild(){
    System.out.println("Demo child constructor");
    }


    public static void main(String[] args) {
        
    System.out.println("start main");
    /*Demo obj =new Demo();
    obj.fun();
    obj.gun();
    System.out.println(obj.x);
    System.out.println(obj.y);*/
    

    }

}