package Abstraction;

abstract class Vehical{
    //abstrasct class me abstract method honea jaruri hain.
    public int noOfTyer;
    abstract void start();
}
class car extends Vehical
{

    void start()
    {
        System.out.println("start with key");
    }
}

class  scooter extends Vehical
{
    void start()
    {
        System.out.println("scooter start with kick");
    }
}


public class Abstract_Class {
    public static void main(String[] args) {
        Vehical c = new car();
        c.start();
        scooter s = new scooter();
        s.start();
    }
}
