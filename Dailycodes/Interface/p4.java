interface Demo{
    int x=10;
    default void fun(){
        System.out.println("in default Demo");
    }
    static void gun(){
          System.out.println("in default Demo");
    }
}
class demo{
    public static void main(String[] args) {
        System.out.println();
    }
}
