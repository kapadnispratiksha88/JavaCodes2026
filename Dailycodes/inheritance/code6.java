class Demo{
    Demo(){
        System.out.println("constructor1");
    }
}
class Memo extends Demo{
    Memo(){
        System.out.println("constructr2");
    }

}
class Cow{
    public static void main(String[] args) {
        Demo obj1=new Demo();
        

        Memo obj2=new Memo();
        
        

    }
}
