class College{
    String studentName="pratiksha";
    String Branch="ENTC";
    int rollNo=3214;
    void CollegeName(){
        System.out.println("sinhgad colege college of engineering Vadgoan campus");
    }
    class Student{
        int Fees=12000;
        int year=3;
        void Dispaly(){
            System.out.println(studentName);
            System.out.println(Branch);
            System.out.println(rollNo);

        }
    }
        public static void main(String[] args) {
            College obj=new College();
            Student obj2=obj.new Student();
            obj.CollegeName();
            obj2.Dispaly();
            

        }
    }

