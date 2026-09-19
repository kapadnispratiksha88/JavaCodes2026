class Parents{
    void property(){
        System.out.println("car");
    
    }
    void career(){
        System.out.println("doctor");
    }
    void marry(){
        System.out.println("family choice");
    }
}
class Child extends Parents{
    void career(){
        System.out.println("youtuber");
    }
    void marry(){
        System.out.println("self choice");
    }
}
class Cilent{
    public static void main(String[] args) {
        Parents obj=new Child();
        obj.career();
        obj.marry();
        obj.property();
    }
}