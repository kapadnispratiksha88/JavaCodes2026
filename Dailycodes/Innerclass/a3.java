class Employee{
    long phoneNumber=9421600058l;
    class Address{
        String Name="pratiksha";
        String City="Nashik";
        int pincode=423301;
        void Display(){
            System.out.println("Taluka Satana");
            System.out.println(Name);
            System.out.println(City);
            System.out.println(pincode);
            System.out.println(phoneNumber);
        }
    }
    public static void main(String[] args) {
        Employee obj=new Employee();
        Address obj2=obj.new Address();
        obj2.Display();
    }
}