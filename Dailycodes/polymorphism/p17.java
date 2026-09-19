class Demo{
    private void fun(){
        System.out.println("in fun demo");
    }
}
class Demochild extends Demo{
    void fun(){
        System.out.println("in fun demochild");
    }
}
class cilent{
    public static void main(String[] args) {
        Demo obj=new Demochild();
        obj.fun();
    }
}