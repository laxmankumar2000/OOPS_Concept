package MultiThreading.Create;

public class throughInterface implements Runnable{
    @Override
    public void run() {
        System.out.println("crete by runanble inteface child threads");
    }

    public static void main(String[] args) {

        throughInterface t = new throughInterface();
        Thread th = new Thread(t);
        th.start();
        System.out.println("in main thread");
    }
}
