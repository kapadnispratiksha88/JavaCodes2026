class Application{
    static class Config{
        String applic="health";
        int num=30;
        String Database="SQL";
        static int fun(){
            Config obj2=new Config();
            System.out.println(obj2.applic);
            System.out.println(obj2.num);
           return 30;

        }
    }
    public static void main(String[] args) {
        Config obj3=new Config();
        obj3.fun();
    }
}