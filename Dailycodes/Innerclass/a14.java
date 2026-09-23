class Employee{
    void Salary(){
        class Calculate{
            int DA=20000;
            int HRA=2000;
            int bSalary=300000;
           int  totals=DA + HRA +bSalary;

            void total(){
                System.out.println(totals);
            }
        }
        Calculate obj=new Calculate();
        obj.total();

    }
    public static void main(String[] args) {
        Employee obj2=new Employee();
        obj2.Salary();
    }
}