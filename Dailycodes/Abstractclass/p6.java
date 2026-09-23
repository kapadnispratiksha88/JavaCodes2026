abstract class Parents{
    void career(){
        System.out.println("engg");
    }
    abstract void marry();
}
abstract class Child extends Parents{

}
class Cilent{
    public static void main(String[] args) {
        Child obj=new Child();
    }
}