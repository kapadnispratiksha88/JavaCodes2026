class Demo{
    Demo(){
        super();
        System.out.println("Demo constructor");
    }
}
class Memo extends Demo{
    Memo(){
        super();
        System.out.println("Memo constructor");
    }
}
class Vishvu{
    public static void main(String[] args) {
        Demo obj1=new Demo();
        Memo obj2=new Memo();
    }
}