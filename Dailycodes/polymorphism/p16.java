class Demo{
    void fun(int x){
        System.out.println("in fun Demo");
    }
}
class Demochild extends Demo{
    private void fun(int y){
        System.out.println("in fun demo child");
    }
}
class Client{
    public static void main(String[] args) {
        
    }
}