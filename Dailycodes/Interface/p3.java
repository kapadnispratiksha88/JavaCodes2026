interface Demo{
    void fun();
}
class Child implements  Demo{
    public void fun(){
        System.out.println("in fun child");
    }
}
class Cilent{
    public static void main(String[] args) {
        Child obj=new Child();
        obj.fun();
    }
}