class Mobile{

    class SIM{
        int No=7564;
        String MobileBrand="motorola";
        String SimProvider="Airtel";
        void print(){
            System.out.println(No);
            System.out.println(MobileBrand);
            System.out.println(SimProvider);
        }
    }
    public static void main(String[] args) {
        new Mobile().new SIM().print();
    }
}