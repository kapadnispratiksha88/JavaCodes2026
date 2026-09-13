class Demo{
    int x=10;
    static int y=20;
    Demo(){
        System.out.println("constructor Demo");
    }

}


class Memo extends Demo{
    int x=20;
    Memo(){
       // super();
       // this.x=20;
        System.out.println("meme constructor");
    }
    void fun(){
    
    System.out.println(this.x);
    System.out.println(Demo.this.x);
}

    public static void main(String[] args) {
        Memo obj=new Memo();
        obj.fun();
    }
}