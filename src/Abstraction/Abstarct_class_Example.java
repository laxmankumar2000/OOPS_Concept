package Abstraction;

abstract  class Bike
{
    Bike(){
        System.out.println("bike is created");

    }

    abstract void run();
    void changeGear()
    {
        System.out.println("gear changed");
    }
}

class Honda extends Bike{
    void run()
    {
        System.out.println("running safly");
    }

}
public class Abstarct_class_Example {
    public static void main(String[] args) {
        Bike b;
        b = new Honda();

        b.run();

        b.changeGear();
    }
}
