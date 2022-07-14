package Annotation;

interface   annotaion1
{
//    void show()
//    {
//        System.out.println("Annotaion");
//    }

    void show();
}

class poly implements annotaion1
{

    @Override
    public void show() {
        System.out.println("anno");
    }

//    void show(int x)              //gives error
//    {
//        System.out.println("anno");
//    }
}
public class override {
    public static void main(String[] args) {
        annotaion1 obj= new poly();
        obj.show();
    }
}
