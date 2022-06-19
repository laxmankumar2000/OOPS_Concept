package Abstraction;

interface I1
{
    public abstract void run();

    // 0r void run1();

    //field me public static final for variable

        int a=00;
    public static  final int num =20;


}

interface  I2
{
    //
    //java 8 ke bad hm lof default method bna skte h bt concrete method hoga vo mtlb body hpgi
    // and we can use static method also
    default void eat()
    {
        System.out.println("jaba 8 default method");
    }
    static  void run3()
    {
        System.out.println("jaba 8 static method");

    }
}
interface  I3
{
    //java 9 ke bad hm interface me privated method bna skte h
       private void method1()
    {
        System.out.println("jaba 9 private  method");

    }
}
public class Interface_Ex  implements I2,I3,I1 {

//    void run()
//    {
//        System.out.println("runing");
//    }
    // me yha pr ese ni likh skta kyuki interface me public  h or me yha pr public se chota access specifire use kr rha hu to i
    //isliye vo gussa ho jayega iska mtlb h ki mujhe yha pr ya to public use krna h h ya usse bda.... bt bda ni hota h


    public void run()
    {
        System.out.println("runing");
    }


    public static void main(String[] args) {

        // me interface ka instatacce ni bna sta
        Interface_Ex i = new Interface_Ex();
        i.run();
        i.eat();
        I2.run3();
        int b = I1.num;
        System.out.println(I1.a + "   " + b);
    }
}

