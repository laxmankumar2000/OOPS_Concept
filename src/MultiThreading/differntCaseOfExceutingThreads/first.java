package MultiThreading.differntCaseOfExceutingThreads;
// Performing single task from single Thread
public class first extends Thread {
    @Override
    public void run()

    {
        System.out.println("in chile thread");
    }

    public static void main(String[] args) {
        first t = new first();
        t.start();
        System.out.println("Main Thread");
    }

}
