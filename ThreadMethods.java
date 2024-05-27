class Work extends Thread
{
    Work(String name)
    {
        super(name);
    }
    public void run()
    {
        System.out.println("Current Thread : "+Thread.currentThread().getName()+" and it's priority = "+Thread.currentThread().getPriority());
        try{Thread.sleep(500);}catch(Exception e){}
    }   
    
    
}  
public class ThreadMethods {
    public static void main(String av[])
    {
        Thread t1=new Work("One");
        Thread t2=new Work("Two");
        t1.setPriority(7);
        t1.start();
        t2.start();
        System.out.println("Current Thread : "+Thread.currentThread().getName()+" and it's priority = "+Thread.currentThread().getPriority());
         
    }
}
