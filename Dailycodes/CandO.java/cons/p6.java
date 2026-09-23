class Demo{
    float y=10.8f;
    {
        System.out.println("instance block 1");
    }
}
class Demochild extends Demo{
    
}
class user{
    public static void main(String[] args) {
        
    
    Demochild obj=new Demochild(); //this called composition
    }

}