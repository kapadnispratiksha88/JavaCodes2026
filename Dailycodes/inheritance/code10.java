class Demo{
    int x=10;
    Demo(){
        System.out.println("Demo constructor");
    }
}
class Memo extends Demo{
    Memo(){
        int y=20;
        Memo(){
            System.out.println("mewo mewo");
        }
        void gugulu(){
            System.out.println(x);
            System.out.println(y);
        }
    }
}