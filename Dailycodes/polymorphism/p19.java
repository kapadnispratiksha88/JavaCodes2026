class Demo{
    void fun(int x,float y){
        System.out.println("in fun demo");
    }
}
class Demochild extends Demo{
    void fun(int y){
        System.out.println("in fun demochild");
    }
}
class cilent{
    public static void main(String[] args) {
        Demochild obj=new Demochild();
        obj.fun(10);
    }
}