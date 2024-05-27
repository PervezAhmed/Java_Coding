/*A static method can access instance members(instance variables and instance methods) only by using a reference(object)
 whether they belongs to same class or not.*/
class  StaticMethod  {
    int x = 11;
    static int y = 22;
    void show()  {
        System.out.println("In show method:");
        System.out.println(x);
        System.out.println(y);
    }
    static void display()  {
        System.out.println("In display method:");
        //System.out.println(x);--> error raises because static methods can access only static variables or staic methods directly
        System.out.println(y);
    }
    public static void main(String[] args)  {
        StaticMethod s = new StaticMethod();
        s.show();
        StaticMethod.display();
    }
}
