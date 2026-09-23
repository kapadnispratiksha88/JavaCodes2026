package cons;
class Demo{
    Demo(int x,float y){
        System.out.println("int float");
    }
    Demo(float x,int y){
        System.out.println("float int");
    }
    public static void main(String[] args) {
        Demo(20.5f,30.5f);
    }
}
