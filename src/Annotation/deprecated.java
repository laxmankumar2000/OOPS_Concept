package Annotation;

class annotaion
{
    void m()
    {
        System.out.println("in m");
    }
    @Deprecated
    void n()
    {
        System.out.println("in n");
    }
}
public class deprecated {
    public static void main(String[] args) {
        annotaion obj = new annotaion();
        obj.n();
    }
}
