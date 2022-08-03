package MultiThreading.ThreadClassMethodsAndConstructors.PreventExecutionThread05;

/*
sleep method is used to stop execution of program for a specific time after finished time it will be start automatically
these method are overloded

1. public static native void sleep(long mili) throws InterruptedException
2. public static void sleep(long mili, int nano)  throws InterruptedException

used  timer, change slide in ms ppt, blinking bulbs
 */

public class sleep1 extends Thread{
    public void run()
    {
        try{
            for (int i = 0; i <=5; i++) {
                System.out.println(i + " " + currentThread().getName());
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        sleep1 t = new sleep1();
        t.start();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i + currentThread().getName());
                Thread.sleep(1000);
            }
        }
        catch (Exception e )
        {
            System.out.println(e);
        }
    }
}
