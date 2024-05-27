public class Classes {
    public static void main(String args[])
    {
        System.out.println("Hi");
        Subclass sub=new Subclass();
        sub.printTheMessage();
    }
}

class Subclass
{
    public void printTheMessage()
    {
        System.out.println("Bye");
    }
}