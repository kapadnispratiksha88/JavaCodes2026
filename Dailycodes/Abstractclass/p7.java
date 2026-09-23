abstract class Parents{
    void career(){
        System.out.println("engg");
    }
    abstract void marry();
}
class Child extends Parent{
    void marry(){
        System.out.println("self choice");
    }
}
class Cilent{
    public static void main(String[] args) {
        Child obj=new Child();
        obj.career();
        obj.marry();
    }
}