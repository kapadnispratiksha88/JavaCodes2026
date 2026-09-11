class Demo{
    void fun(){
        System.out.println("In fun");
    }

}
class Memo extends Demo{

}
class Pratiksha{
    public static void main(String[] args) {
        Demo obj1=new Demo();
        obj1.fun();

        Memo obj2=new Memo();
        obj2.fun();
        
    }
}
