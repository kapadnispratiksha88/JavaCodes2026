class Temo{
    Temo(){
        super();
        System.out.println("Temo constructor");
    }    
}
class Demo extends Temo{
        Demo(){
            super();
        System.out.println("Demo costructor");
        }
}
class Memo extends Demo{
    Memo(){
        super();
        System.out.println("memo constructor");
    }
}
class Client5{
        public static void main(String[] args){
            Memo obj=new Memo();
            Demo obj2=new Demo();
            Temo obj3=new Temo();
             

        }
}