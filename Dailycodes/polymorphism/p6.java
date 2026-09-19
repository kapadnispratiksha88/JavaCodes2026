class Parents{

    int x=10;
    static int y=20;

    Parents(){
        System.out.println("parents constructor");
    }
    private void fun(){
        System.out.println("in fun- parent");
    }
}
class Child extends Parents{
Child(){
    System.out.println("in child constructor");
}
}
class Cilent{
    public static void main(String[] args) {
        Child obj=new Child();
        System.out.println(obj.x);
        System.out.println(obj.y);
        obj.fun();
        
    }
}