class Test  {
    int a = 11;
    int b = 22;
    }
    class Demo extends Test  {
    int a = 33;
    int b = 44;
    void m1()  {
    System.out.println("demo class m1");
    }
}
    class SuperKeyword extends Demo  {
    int a = 55;
    int b = 66;
    void m2()  {
    System.out.println("SuperKeyword class m2");
    }
    void m3()  {
    System.out.println("SuperKeyword class m3");
    }
    void show()  {
    int a = 77;
    int c = 88;
    Test t = new Test();
    System.out.println(t.a);
    System.out.println(b);
    System.out.println(super.a);
    System.out.println(c);           
    System.out.println(this.a);
    System.out.println(this.b);         
    System.out.println(a);
    System.out.println(super.b);
    m1(); //this.m1()   super.m1()
    //super.m2();-->error:there is no m2 method in parent class i.e.  Demo class
    this.m2();        //this.m2()
    m3();        //this.m3()
    }
    public static void main(String[] args)  {
    SuperKeyword s = new SuperKeyword();
    s.show();
    }
}
    