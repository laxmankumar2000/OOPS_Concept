package MultiThreading.ThreadClassMethodsAndConstructors.PreventExecutionThread05;

/*
used to stops the current thread execution thread and give chance to other thread for exeution
ex billing
theard provide the hint to the threaed scheduer then it depends on thread scheduler that accept or ereject
ther reuset of thread
OUTPUT WILL DIFFER EVUERTIME

PUBLIC STATIC NATIVE VOID YIELD()

 */
public class yield02 extends Thread{
    @Override
    public void run()
    {
            for (int i =1;i<=5;i++)
            {
                System.out.println(i + " child thread");
            }
    }

    public static void main(String[] args) {
        yield02 t = new yield02();
        t.start();
        Thread.yield();

//            t.join();
            for (int i = 1; i <= 5; i++) {
                System.out.println(i + " Main thread");
            }
    }

}

/*
accpet
1 Main thread
2 Main thread
3 Main thread
4 Main thread
5 Main thread
1 child thread
2 child thread
3 child thread
4 child thread
5 child thread

reject
1 child thread
1 Main thread
2 child thread
2 Main thread
3 child thread
3 Main thread
4 child thread
4 Main thread
5 child thread
5 Main thread
 */
