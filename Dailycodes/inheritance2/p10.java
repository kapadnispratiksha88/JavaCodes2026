class Demo {
    int x=10;
    
    Demo(){
        System.out.println("Demo contructpr");
    }
    void fun(){
        System.out.println("in fun - demo");
    }
    
}
class Demochild extends Demo{
    Demochild(){
    System.out.println("Demo child constructor");
    }
    void gun(){
        System.out.println("in gun - demochild");
    }

}
class Client{
    public static void main(String[] args) {
        
    
    Demochild obj =new Demochild();
    obj.fun();
    obj.gun();
    System.out.println(obj.x);
    //System.out.println(obj.y);
    

    }

}
