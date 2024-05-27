class  Sample  {
    int a = 11;
    int b = 22;
    void display()  {
        int b = 33;
        int c = 44;
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(b);
        System.out.println(c);
    }
    public static void main(String args[])  {
        Sample s = new Sample();
        s.display();
    }
}
