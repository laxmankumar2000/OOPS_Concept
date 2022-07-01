//class A
//{
//    int i = 10;
//}
//
//class B extends A
//{
//    int i = 20;
//}
//
//public class eample
//{
//    public static void main(String[] args)
//    {
//        A a = new B();
//
//        System.out.println(a.i);
//    }
//}

//class A
//{
//    {
//        System.out.println(1);
//    }
//}
//
//class B extends A
//{
//    {
//        System.out.println(2);
//    }
//}
//
//class C extends B
//{
//    {
//        System.out.println(3);
//    }
//}
//
//public class eample
//{
//    public static void main(String[] args)
//    {
//        B c = new C();
//    }
//}              1 2 3

//class A
//{
//    String s = "Class A";
//}
//
//class B extends A
//{
//    String s = "Class B";
//
//    {
//        System.out.println(super.s);
//    }
//}
//
//class C extends B
//{
//    String s = "Class C";
//
//    {
//        System.out.println(super.s);
//    }
//}
//
//public class eample
//{
//    public static void main(String[] args)
//    {
//        C c = new C();
//
//        System.out.println(c.s);
//    }
//}



//class A
//{
//
//    {
//        System.out.println("THIRD");
//    }
//}
//
//class B extends A
//{
//    static
//    {
//        System.out.println("SECOND");
//    }
//}
//
//class C extends B
//{
//    static
//    {
//        System.out.println("FIRST");
//    }
//}
//
//public class eample
//{
//    public static void main(String[] args)
//    {
//        C c = new C();
//    }
//}

/*
THIRD
SECOND
FIRST
 */



//
//class A
//{
//    public A()
//    {
//        System.out.println("Class A Constructor");
//    }
//}
//
//class B extends A
//{
//    public B()
//    {
//        System.out.println("Class B Constructor");
//    }
//}
//
//class C extends B
//{
//    public C()
//    {
//        System.out.println("Class C Constructor");
//    }
//}
//
//public class eample
//{
//    public static void main(String[] args)
//    {
//        C c = new C();
//    }
//}
//    Class A Constructor
//        Class B Constructor
//        Class C Constructor