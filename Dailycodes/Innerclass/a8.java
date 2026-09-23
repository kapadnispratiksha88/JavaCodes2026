class Computer{
    String Name="Lenovo";
    static class Confrigation{
        int storeRam=256;
        String Processor="i5";
        String GPU="2050";
        void Display(){
           // System.out.println(Name);
            System.out.println(Processor);
            System.out.println(GPU);
            System.out.println(storeRam);
            Computer obj=new Computer();
            System.out.println(obj.Name);
        }

    }
    public static void main(String[] args) {
        Confrigation obj2=new Confrigation();
        obj2.Display();
    }
}
