import javax.xml.crypto.dsig.spec.HMACParameterSpec;

class Hospital{
    class Patient{
        int ID=12343;
        String Name="Pratiksha";
        String Diease="ACL injury";
        void info(){
            System.out.println(ID);
            System.out.println(Name);
            System.out.println(Diease);
        }
    }
    public static void main(String[] args) {
        new Hospital().new Patient().info();
    }
} 
