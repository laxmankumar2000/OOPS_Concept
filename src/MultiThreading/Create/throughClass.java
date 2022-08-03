package MultiThreading.Create;

public class throughClass  extends Thread{
    public  void run()
    {
        System.out.println("i am in a chile thread");
    }

    public static void main(String[] args) {
        {
            throughClass t = new throughClass();
            t.start();
            System.out.println("i am in main thread");
        }
    }
}
