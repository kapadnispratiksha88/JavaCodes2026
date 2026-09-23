package cons;
class Demo {
    Demo(){
        System.out.println("no argument");
    }
    Demo(int x){
        System.out.println("para constructor");
    }
    public static void main(String[] args) {
        Demo obj1=new Demo();
        Demo obj2=new Demo(10); 
    }
    
}
