public class Demo{
    int x=10;
    static int y=20;
    Demo(){
        System.out.println("constructor");
    }
    Demo(int val){
        System.out.println("para constructor");
    }
    void fun(){
        System.out.println(x);
        System.out.println(y);
    }
    static void gun(){
        Demo obj=new Demo();
        System.out.println(obj.x);
        System.out.println(obj.y);
    }
    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.fun();
        obj.gun();
    }
}

