class Parents{
    int x=10;
    static int y=20;
    Parents(){
        System.out.println("parent constructor");
    }
    private void fun(){
        System.out.println("in fun -parents");
    }
}
class Child extends parents{
    Child(){
        System.out.println("child constructor");
    }
}
class Client{
    public static void main(String[] args) {
        Parents obj=new Parents();
        obj.fun();

    }
}