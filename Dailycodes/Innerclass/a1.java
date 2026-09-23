class BankAccount{
    long accountNumber=123456789l;
    String bankName="IDBI";
    void Installment(){
        System.out.println("per month 450000");
    }
    class Transition{
        int Amount=10000;
        String month="september";
        void transitionLimit(){
            System.out.println("2,00,000Rs");
            System.out.println(accountNumber);
            System.out.println(bankName);
        }
    

    }
    public static void main(String[] args) {
        BankAccount obj=new BankAccount();
        Transition obj2=obj.new Transition();
        //obj.Installment();
        obj2.transitionLimit();
        


    }

}