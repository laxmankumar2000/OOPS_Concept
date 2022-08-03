package MultiThreading.ThreadClassMethodsAndConstructors.daemonThread03;

/*
wrong poutpur

It is a low priority thread tha run iln the baclground to perform some task to another threads and
used as service provider threads tht provides secoce to user theread.
ex. garbage collectior

mehtod
1. public final boolean isDaemon() -- test the theread os daemon thread ornot
2. public final void setDaemon(boolean on)  -- it marks the thread is daemon othreads.

point to be npted

1. we have to create deamon threads before start the threads. otherwose it create the run time error. ILLIGAL
2. We can not create main thread as a daemon thread because it already started by jvm.
3.if we creat a daemon thread then we have to perform some action in mainthread otherwise it will not worl because
daemin thread woek as background.

 */


import MultiThreading.ThreadClassMethodsAndConstructors.namingThread02.Text;

public class text  extends  Thread{
    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().isDaemon());
        //currentThread().setDaemon(true);
        System.out.println("ram ram ji");
        System.out.println(currentThread().isDaemon());
    }

    public static void main(String[] args) {
        text t = new text();

        t.setDaemon(true);
        System.out.println("hii");
        System.out.println(t.isDaemon() + " main chled");
        t.start();
//        System.out.println(currentThread().getName() + " is daemon " + t.isDaemon());



    }
}
