class Demo {
    int x = 10;

    Demo() {
        System.out.println("Demo constructor");
    }

    void fun() {
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.fun();
    }
}
