abstract class Shape  {
    int dim1, dim2;
    Shape(int dim1, int dim2)  {
    this.dim1  = dim1;
    this.dim2 = dim2;
    }
    abstract double area();
    }
class Rectangle extends Shape  {
    Rectangle(int length, int breadth)  {
        super(length, breadth);
    }
    double area()  {
        return dim1 * dim2;
    }
}
class Triangle extends Shape  {
    Triangle (int base, int height)  {
        super(base, height);
    }
    double area()  {
        return 0.5 * dim1 * dim2;
    }
}
class Calculation  {
    public static void main(String[] args)  {
        Shape s; 
        s = new Rectangle(3,4);
        double res = s.area();
        System.out.println("Rectangle area : "+res);
        s = new Triangle(5,6);
        res = s.area();
        System.out.println("Triangle area : "+res);
    }
}
    