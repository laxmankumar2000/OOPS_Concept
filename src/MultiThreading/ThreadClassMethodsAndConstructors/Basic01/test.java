package MultiThreading.ThreadClassMethodsAndConstructors.Basic01;

/*
Basic

1. public void run() -- used to action on a thread
2. public synchronizzed  void start()  -- used to start the execution of the Threads
3. public static native Thread currentThread()-- return the refrence the of currently executoing thread
4. public final native boolean isAlive() -- return false when thread is died..
 */


public class test extends Thread{
    @Override
    public void run()
    {
        System.out.println("In a chled thread");
        System.out.println("chile " + Thread.currentThread()); // Thread-0 , 5, main
        System.out.println("child1 " + currentThread());
    }

    public static void main(String[] args) {
        test t = new test();
        System.out.println(currentThread());
        System.out.println(Thread.currentThread());// main,5,main
        System.out.println();
        System.out.println(" before + " +t.isAlive());                // false
        t.start();
        System.out.println(t.isAlive());                              //true
    }

}
