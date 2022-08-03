package MultiThreading.differntCaseOfExceutingThreads;
//Perfomring single task from multiple threads
public class second  extends  Thread{
    @Override
    public void run()
    {
        System.out.println("hii single task multiple threds");

    }

    public static void main(String[] args) {
        second t = new second();
        t.start();
        System.out.println("Main thread1");
        second t1 = new second();
        t1.start();
        System.out.println("Main thread2");
    }
}
