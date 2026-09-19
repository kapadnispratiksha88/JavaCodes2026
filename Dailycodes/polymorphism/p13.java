class Demo{
    int x=80;
    void fun(){
        System.out.println("in fun demo");
    }
}
class Demochild extends Demo{
    int x=65;
    void fun(){
        System.out.println("in gun");
    }
}
class Cilent{
    public static void main(String[] args) {
        Demo obj=new Demochild();
        obj.fun();
        System.out.println(obj.x);

    }
}

