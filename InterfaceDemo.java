interface Sample  {
    int x = 45;
    void msg();
}
interface Test  {
    int y = 99;
    void msg();
}
class InterfaceDemo implements Sample, Test  {
    public void msg()  {
        System.out.println("Multiple Inheritance");
    }
    public static void main(String[] args)  {
        System.out.println(x);
        System.out.println(y);
        InterfaceDemo id = new InterfaceDemo();
        id.msg();
        Sample s = new InterfaceDemo();
        s.msg();
        Test t = new InterfaceDemo();
        t.msg();
    }
}
    