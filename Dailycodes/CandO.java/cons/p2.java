class Demo{
    Demo(int x,float y){
        System.out.println("int - float");
    }
    Demo(int x,float y){
        System.out.println("int -float");
    }
    public static void main(String[] args) {
        Demo(20.5f,30.5f);
    }
}
