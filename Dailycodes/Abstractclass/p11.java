abstract class Demo{
    int x=10;
    Demo(){
        System.out.println("demo");
    }
}
class Demochild extends Demo{
    int x=10;
    Demochild(){
        System.out.println("demochild");
    }
}
class Cilent{
    public static void main(String[] args) {
        Demochild obj =new Demochild();
        System.out.println(obj.x);
    }
}