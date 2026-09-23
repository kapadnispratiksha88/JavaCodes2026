class Bank{
    String bank="IDBI";
    static class Branch{
        String branch="Satana";
        long accountNo=2342326677l;
        char Sub='D';
        void fun(){
            System.out.println(branch);
            System.out.println(accountNo);
            System.out.println(Sub);
        }

    }

    public static void main(String[] args) {
       // Bank obj=new Bank();
        Branch obj2=new Branch();
        obj2.fun();


    }
}