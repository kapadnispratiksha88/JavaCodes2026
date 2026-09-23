class Parent{
    void career(){
        System.out.println("Engg");
    }
    void marry(){
        System.out.println("family choice");
    }
}
class Child extends Parent{
    void marry(){
        System.out.println("self choice");
    }
}class Cilent{
    public static void main(String[] args) {
        Parent obj1=new Parent();
        obj1.marry();
        Child obj2=new Child();
        obj2.marry();
        Parent obj3=new Child();
        obj3.marry();
    }
}