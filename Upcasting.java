class Parent  {
    void show()  {
        System.out.println("parent class show method");
    }
    void display()  {
        System.out.println("parent class display method");
        show();
    }
}
class Child extends Parent  {
    void show()  {
        System.out.println("child class show method");
    }
    void print()  {
        System.out.println("child class print method");
    }
}


public class Upcasting  {
    public static void main(String[] args)  {
        Parent p = new Child();// [OR]  Parent p = (Parent) new Child(); -->Using the ‘p’ reference variable we can access all the members of parent class and only those members of child class, which are overridden.
        Child c = (Child) p;
        p.show();                                //  |>Optional to write Parent
        p.display();
        c.show();
        c.display();
        //p.print(); -->Error:The method print() is not defined for the type Parent
        c.print();
    }
}
    