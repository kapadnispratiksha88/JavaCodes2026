abstract class Demo{
    int x=10;
    Demo(){
        System.out.println("Demo constructor");
    }
}
class Demochild extends Demo{
    Demochild(){
        System.out.println("Demo child constructor");
    }
}
class user{
    public static void main(String[] args) {
        Demo obj =new Demochild();
    }
}