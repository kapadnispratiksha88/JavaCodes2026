class Demo{
    Demo(){
        System.out.println("Demo constructor");
    }
}
class Memo extends Demo{
    Memo(){
        super();
        System.out.println("Memo constructor");
    }
}
class Client4{
    public static void main(String[] args) {
        Demo obj1=new Demo();
        Memo obj2=new Memo();
        
    }
}
