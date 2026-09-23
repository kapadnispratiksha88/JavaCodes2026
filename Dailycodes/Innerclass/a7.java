import Company.Deparment;

class Company{

    String empName="pratiksha";
    int Salary=6500000;
    static class Deparment{
        
        String DepName="production";
        String compName="TCS";
        void Info(){
            System.out.println(DepName);
            System.out.println(compName);
            Company obj=new Company();
            System.out.println(obj.Salary);
            System.out.println(obj.empName);
        }
    }
}
class User{
    public static void main(String[] args) {
       //Deparment obj=new Deparment();//IT is the inner object;
       //obj.Info();
        Company obj=new Company();
        Company.Deparment obj2=new Company. Deparment();
        obj2.Info();
    }
}
