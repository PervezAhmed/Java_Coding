public class ThreadAnonymous
{
    public static void main(String a[]) throws Exception
    {
        Thread obj1=new Thread(() ->
        {
            for(int i=1;i<=5;i++){
                System.out.println("Hi");
                try{Thread.sleep(1000);} catch(Exception e){}
            }
        });
        Thread obj2=new Thread(() ->
        {
            for(int i=1;i<=5;i++){
                System.out.println("Hello");
                try{Thread.sleep(1000);} catch(Exception e){}
            }  
        });
        obj1.start();
        try{Thread.sleep(10);} catch(Exception e){}
        obj2.start();
        
        obj1.join();
        obj2.join();
        System.out.println("Bye"); 
    }
}