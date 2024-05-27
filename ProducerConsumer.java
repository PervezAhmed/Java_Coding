class A
{
    int num;
    boolean setValue=false;
    public synchronized void produce(int num)
    {
        while(setValue)
        {
            try{wait();}catch(Exception e){}
        }
        System.out.println("Produced : "+num);
        this.num=num;
        setValue=true;
        notify();
    }

    public synchronized void consume()
    {
        while(!setValue)
        {
            try{wait();}catch(Exception e){}
        }
        System.out.println("Consumed : "+num);
        setValue=false;
        notify();
    }
}

class Producer implements Runnable
{
    A a;
    Producer(A a)
    {
        this.a=a;
        Thread t=new Thread(this,"Producer");
        t.start();
    }
    public void run()
    {
        int i=0;
        while(true)
        {
            a.produce(i++);
            try{Thread.sleep(500);}catch(Exception e){}
        }
    }
}

class Consumer implements Runnable
{
    A a;
    Consumer(A a)
    {
        this.a=a;
        Thread t=new Thread(this,"Consumer");
        t.start();
    }
    public void run()
    {
        while(true)
        {
            a.consume();
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}

public class ProducerConsumer
{
    public static void main(String []av)
    {
        A a = new A();
        new Producer(a);
        new Consumer(a);
    }
}