class Addition{
    int add(int num1,int num2){
        System.out.println("in add -2");
        return num1+num2;
    }
    int add(int num1,int num2,int num3){
        System.out.println("in add 3");
        return num1+num2+num3;
    }
    public static void main(String[] args) {
        Addition obj=new Addition();
        int retValve=obj.add(10,20);
        System.out.println(retValve);

        int retValve2=obj.add(10,20,30);
        System.out.println(retValve2);

    }
}