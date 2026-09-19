class parents{
    int x=10;
    static int y=20;

    parents(){
        System.out.println("parent constructor");
    }
    void fun(){
        System.out.println("in fun Demo");
    }
}
class child extends parents{
    child(){
        System.out.println("child constructor");
    }
} 
class cilent{
    public static void main(String[] args){
        child obj= new child();
        System.out.println(obj.x);
        System.out.println(obj.y);
        obj.fun();
    }
}