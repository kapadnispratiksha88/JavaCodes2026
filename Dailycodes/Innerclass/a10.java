class College{

    static class Course{
        String Duration="12 month";
        String courseName="CORE java + Full stack+ DSA";
        void Dispaly(){
            System.out.println(Duration);
            System.out.println(courseName);
        }

    }

    public static void main(String[] args) {
       Course obj=new Course();
        obj.Dispaly();

    }
}