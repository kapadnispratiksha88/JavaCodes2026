class Parents{
    void career(){
        System.out.println("Doctor");
    }
} 
class Child extends Parents{

}
class Cilent{
    public static void main(String[] args) {
        Child obj=new Child();
        obj.career();
    }
}