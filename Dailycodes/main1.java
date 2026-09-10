public class main1 {
        public static void main(String[] args) {
            ATM obj=new ATM(123456789l, "SBI", 7559191476l, "pratiksha");
            System.out.println(obj.accoundHolder);
            System.out.println(obj.accountNo);
            System.out.println(obj.bankName);
            System.out.println(obj.phoneNo);
        }    
}
