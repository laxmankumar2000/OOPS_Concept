package MultiThreading.differntCaseOfExceutingThreads;

//Performing multiple task from multiple threads


public class fourth extends Thread{
    public void run()
    {
        System.out.println("Task 1" + Thread.currentThread().getName());
    }

}
class fourth1 extends Thread
{
    public void run()
    {
        System.out.println("Task 2" + Thread.currentThread().getName());
    }
}

class test{
    public static void main(String[] args) {
        fourth t1 = new fourth();
        t1.start();
        fourth1 t2 = new fourth1();
        t2.start();
    }
}
