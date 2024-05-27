public class AnonymousDemo 
{
    public static void main(String a[]) throws Exception
    {
        Runnable r1=new Runnable()
                {
                    public void run()
                    {
                        for(int i=1;i<=5;i++){
                            System.out.println("Hi");
                            try{Thread.sleep(1000);} catch(Exception e){}
                        }
                    }
                };
        
        Runnable r2=new Runnable()
                {
                    public void run()
                    {
                        for(int i=1;i<=5;i++){
                            System.out.println("Hello");
                            try{Thread.sleep(1000);} catch(Exception e){}
                        }
                    }  
                };
        Thread obj1=new Thread(r1);
        Thread obj2=new Thread(r2);
        obj1.start();
        try{Thread.sleep(10);} catch(Exception e){}
        obj2.start();
        
        obj1.join();
        obj2.join();
        System.out.println("Bye"); 
    }
}