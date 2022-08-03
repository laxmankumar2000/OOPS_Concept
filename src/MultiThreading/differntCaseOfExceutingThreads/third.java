package MultiThreading.differntCaseOfExceutingThreads;


//Performing multile task from single threads

//it is not supporting the third case of this beacuse it will run first thrad then second then third.
//for ex. -- suppose the vlc player have some thrads like play vidoe play music then increase process bar. if this is a case of
//third then our videoplay like first play vidoe then audio then process bar if the vido hane 5 min then it will be of 15 min
//that ehy it is not support by java


import MultiThreading.Thr;

public class third extends Thread {

    public void run ()
    {
        System.out.println("Task 1");
    }
//    public void run()
//    {
//        System.out.println("Task 2");
//    }

}
