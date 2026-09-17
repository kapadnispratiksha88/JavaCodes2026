class Demo {
    int x=10;
    static int y=20;
    Demo(){
        System.out.println("Demo constructor");
    }
    void fun(){
        System.out.println("in fun");
    }
    static void gun(){
        System.out.println("In gun");
    }
}
class DemoChild{

}
class Cilent{
    public static void main(String[] args) {
        DemoChild obj= new DemoChild();
        obj.fun();
        obj.gun();
        System.out.println(obj.x);
        System.out.println(obj.y);
    }

}