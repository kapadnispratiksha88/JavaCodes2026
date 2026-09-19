class parents{
    int x=10;
    static int y=20;
    parents(){
        System.out.println("parent construtor");
    }
    void fun(){
        System.out.println("in fun parents");
    }
}
class child extends parents{
    child(){
        System.out.println("child coonstructor");
    }
    void gun(){
        System.out.println("in gun child");
    }
}
class client{
    public static void main(String[] args) {
        parents obj=new child();
        obj.fun();
        obj.gun();

    }

}
