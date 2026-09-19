class Demo{
    private void fun(int x){
        System.out.println("in fun demo");
    }
}
class Demochild extends Demo{
    void fun(){
        System.out.println("in fundemo child");
    }
}
class cilent{
    public static void main(String[] args) {
        Demochild obj=new Demochild();
        obj.fun();
        //        Demo obj=new Demochild();
        // as chalat nahi


    }
}