class Demo{
    int x=10;
    Demo(){
        System.out.println("Demo constructor");
    }
}
class DemoChild extends Demo{
    DemoChild(){
        System.out.println("Demo child constructor");
    }
}
class Cilent{
    public static void main(String[] args) {
        Demo obj =new DemoChild();
        System.out.println(obj.x);
    }
}