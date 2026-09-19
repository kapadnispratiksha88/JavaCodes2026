class Demo{
    private void fun(int x) {
        System.out.println("in fun demo");
    }
}
class Demochild extends Demo{
   protected void fun(int y){
        System.out.println("in fun Demochild");
    }
}
class cilent{
    public static void main(String[] args) {
        
    }
}