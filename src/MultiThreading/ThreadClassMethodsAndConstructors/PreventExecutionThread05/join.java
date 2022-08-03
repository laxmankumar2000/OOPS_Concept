package MultiThreading.ThreadClassMethodsAndConstructors.PreventExecutionThread05;

/*
join is used to if a thread want to wait for another thread to complete its task then we should use join method
ex-- licence
 public dinal void join() throws InterruptException


join se phle refrence uska lagate h jiska task hmko phle  execute krna hota h. or jiska rokna hora h uske side lagate h.
 */

public class join extends Thread{
    static Thread mainthread;
    public void run()
    {

        try{mainthread.join();
            for (int q = 1  ; q <=5 ; q++) {
                System.out.println(q + currentThread().getName());

            }

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        mainthread = currentThread();
        join t = new join();
        t.start();
        try {
            //t.join();
            for (int i = 1; i <= 5; i++) {
                System.out.println(i + currentThread().getName());

            }
        }
        catch (Exception e )
        {
            System.out.println(e);
        }
    }

}
/*
Its ouput is
1main
2main
3main
4main
5main
1Thread-0
2Thread-0
3Thread-0
4Thread-0
5Thread-0
 */


/*

public class join extends Thread{
    public void run()
    {
        try{
            for (int q = 1  ; q <=5 ; q++) {
                System.out.println(q + currentThread().getName());

            }

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        join t = new join();
        t.start();
        try {
            t.join();
            for (int i = 1; i <= 5; i++) {
                System.out.println(i + currentThread().getName());

            }
        }
        catch (Exception e )
        {
            System.out.println(e);
        }
    }

}

its output is
1Thread-0
2Thread-0
3Thread-0
4Thread-0
5Thread-0
1main
2main
3main
4main
5main
 */
