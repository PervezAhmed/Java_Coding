class MethodOverload{
    public int add(int a,int b)
    {
        return (a+b);
    }
    public int add(int a,int b,int c)
    {
        return (a+b+c);
    }
    public float add(float a,float b)
    {
        return (a+b);
    }
    public double add(double a,double b)
    {
        return (a+b);
    }
    public String add(String a,String b)
    {
        return (a+b);
    }
}


public class MethodOverloadingDemo {
    public static void main(String args[])
    {
        MethodOverload m=new MethodOverload();
        System.out.println(m.add(3,5));
        System.out.println(m.add(3,5,7));
        System.out.println(m.add(3.3f,6.6f));
        System.out.println(m.add(3.0,5.5));
        System.out.println(m.add("Pervez","Ahmed"));
    }
}
