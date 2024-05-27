class Jointime extends Thread{ 
    Jointime(String name)
    {
        super(name);
    }   
    public void run(){    
     for(int i=1;i<=5;i++){    
      try{    
       Thread.sleep(500);    
      }catch(Exception e){System.out.println(e);}    
     System.out.println(i);    
     }    
     System.out.println("Status of "+Thread.currentThread().getName()+" : "+Thread.currentThread().isAlive());
    }    
   public static void main(String args[]){    
    Jointime t1=new Jointime("One");    
    Jointime t2=new Jointime("Two");    
    Jointime t3=new Jointime("Three");    
    t1.start();    
    try{    
        t1.join();    
    }catch(Exception e){System.out.println(e);}    
    System.out.println("Status of One : "+t1.isAlive());
    t2.start();    
    t3.start();   
    try{t2.join();
    t3.join(2000);}catch(Exception e){} 
    System.out.println("Status of Two : "+t2.isAlive());
    System.out.println("Status of Three : "+t3.isAlive());
    }    
   }    