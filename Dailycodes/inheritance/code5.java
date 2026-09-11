class Demo {
    
    void fun(){
        System.out.println("Infun");
    }

    
}
class Memo extends Demo{
    void gun(){
        System.out.println("In gun");
    }
}
class Manisha{
    public static void main(String[] args) {
        Demo obj1=new Demo();
        obj1.fun();

        Memo obj2=new Memo();
        obj2.gun();


    }
}

