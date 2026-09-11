 class Demo {
    void fun(){
        System.out.println("In fun");
    }
    void gun(){
        System.out.println("Vishwanath");
    }
    
}
class Memo{

}
class Client1{

    public static void main(String[] args){
        Demo obj1=new Demo();
        obj1.fun();
        obj1.gun();

        Memo obj2=new Memo();
        
    }
}
