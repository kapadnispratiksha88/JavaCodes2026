class Demo {
    int x=10;
    static int y=20;
    Demo(){
        System.out.println("Demo constructor");
    }
    static{
        System.out.println("static block demo");
    }
}
class DemoChild extends Demo{
    int x=30;
    static int y=40;
    static{
        System.out.println("Demo child static block");
    } 
    DemoChild(){
        System.out.println("demo child construtor");
    }
    public static void main(String[] args) {
        System.out.println("start main");
        System.out.println(Demo.y);

        System.out.println(y);
        DemoChild obj=new DemoChild();
        System.out.println("End main");
    }
}
