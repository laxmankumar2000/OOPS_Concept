package Java8;

interface car
{
    void drive();
}
public class Lambda_Expression {
    public static void main(String[] args) {

        car obj = new car()
        {
            @Override
            public void drive()
            {
                System.out.println("car");
            }
        };
        obj.drive();

        car obj2 = () -> System.out.println("hii");
        obj2.drive();
    }
}
