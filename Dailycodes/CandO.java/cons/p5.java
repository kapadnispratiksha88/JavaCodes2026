class Demo{
    int x=10;
   static int y=20;
    static void fun(){
        System.out.println("in fun demo static");
    }

}
class Child extends Demo{
    void gun(){
        System.out.println("in gun demo");

    }
}
class user{
    public static void main(String[] args) {
        
    
    Child obj= new Child();
    obj.fun();
    obj.gun();
    }
}