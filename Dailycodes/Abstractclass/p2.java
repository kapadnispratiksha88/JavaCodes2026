class SujataMastani{
    void taste(){
        System.out.println("uniques tatse");
    }
    void price(){
        System.out.println("120Rs");
    }
}
class SinhgadSM extends SujataMastani{
    void price(){
        System.out.println("130 Rs");
    }
}

class BaramatiSM extends SujataMastani{
    void price(){
        System.out.println("140Rs");
    }

}
class user{
    public static void main(String[] args) {
        SujataMastani obj=new SinhgadSM();
        obj.taste();
        obj.price();

        SujataMastani obj2=new BaramatiSM();
        obj2.taste();
        obj2.price();
    }
}