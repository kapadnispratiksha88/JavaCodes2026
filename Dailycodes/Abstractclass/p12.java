abstract class Demo{
    void fun(){
        System.out.println("in fun Demo");
    }
}
class Demochild extends Demo{
    void gun(){
        System.out.println("in gun demochild");
    }
}
class Client{
    public static void main(String[] args) {
        Demo obj=new Demochild();
        obj.gun();
    }
}