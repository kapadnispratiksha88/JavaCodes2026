interface Demo{
    static void gun(){
        System.out.println("in default Demo");
    }
    class Demohild implements Demo{
        static void gun(){
            Demo.gun();
            System.out.println("in default method: Demochild")
        }
        public static void main(String[] args){
            gun();
        }

    }
}