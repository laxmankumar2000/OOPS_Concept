interface shape{
    float getArea();
    float getPerimeter();
    String toString();
}
class rectangle implements shape{
    float length,width;
    rectangle(float length , float width)
    {
    this.length = length;
    this.width = width;
    }
    public float getArea()
    {
        System.out.println("finding area of rectangle with length " + length + " width " + width);
        return  length*width;
    }
    public float getPerimeter() {
        System.out.println("finding perimeter of rectangle with length " + length + " width " + width);

        return 2*(length+width);
    }
    public String toString()
    {
        return "Rectangle = [Length: "+ length + "width : " + width + "area" + getArea() + "perimeter: " + getPerimeter()+"]";
    }
}

class squre extends rectangle{
    float side;
    squre(float side)
    {

        super(0,0);
        this.side = side;

    }


    public float getArea()
    {
        System.out.println("finding area of squre with side " + side );
        return  side*side;
    }
    public float getPerimeter() {
        System.out.println("finding perimeter of squre with side " + side );

        return 4*side;
    }
    public String toString()
    {
        return "Squre = [side: "+ side + "area" + getArea() + "perimeter: " + getPerimeter()+"]";
    }
}


class circle implements shape{
    float radius;
    circle(float radius)
    {

        this.radius = radius;

    }
    public float getArea()
    {
        System.out.println("finding area of circle with radius " + radius );

        return (float)((3.14)*(radius*radius));
    }
    public float getPerimeter() {
        System.out.println("finding perimeter of circle with radius " + radius );

        return (float) (6.28*radius);
    }
    public String toString()
    {
        return "Circle = [radius: "+ radius      + "area" + getArea() + "perimeter: " + getPerimeter()+"]";
    }
}

public class Shape_Inheritance_Code {
    public static void main(String[] args) {
        float length = 2;
        float width = 3;
        float radius =2 ;
        float side = 2;

        shape re = new rectangle(length,width);
        rectangle sq = new squre(side);
        shape cir = new circle(radius);

        System.out.println("**************************************");
        System.out.println("finding area and periemter");
        System.out.println("**************************************");

        System.out.println("area " + re.getArea() + " per " + re.getPerimeter() + "\n");
        System.out.println("area " + sq.getArea() + " per " + sq.getPerimeter() + "\n");
        System.out.println("area " + cir.getArea() + " per " + cir.getPerimeter() + "\n");

        System.out.println("**************************************");
        System.out.println("printing shaps as String");
        System.out.println("**************************************");

        System.out.println(re.toString());
        System.out.println(sq.toString());
        System.out.println(cir.toString());
    }

}
