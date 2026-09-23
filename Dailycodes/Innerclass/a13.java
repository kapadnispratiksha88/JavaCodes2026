class ShoppingBill{
    void generatebill(){
        class bill{
            int amount =10000;
            void biLL(){
                System.out.println(amount);
            }
        }
        bill obj=new bill();
        obj.biLL();

    }
    public static void main(String[] args) {
        ShoppingBill obj1=new ShoppingBill();
        obj1.generatebill();

    }
}