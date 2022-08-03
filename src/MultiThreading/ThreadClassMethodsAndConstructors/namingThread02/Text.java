package MultiThreading.ThreadClassMethodsAndConstructors.namingThread02;

/*
1.public final String getName() -- return the name of the threads
2.public final synchronized void setName(String name) -- it chamge the set the name of the thread.
 */

public class Text extends Thread{

    @Override
    public void run()
    {
        System.out.println("In chile thread");
        System.out.println(currentThread().getName());
        currentThread().setName("Laxman ka thread");
        System.out.println(Thread.currentThread().getName());
        //System.out.println(10/0);
        //Exception in thread "Laxman ka thread" Exception in thread "main" java.lang.ArithmeticException: / by zero
    }

    public static void main(String[] args) {
        Text t = new Text();
        t.start();
        System.out.println("in main thread");
        System.out.println(currentThread().getName());
        //System.out.println(10/0);
        //Exception in thread "Main" Exception in thread "main" java.lang.ArithmeticException: / by zero

    }
}
