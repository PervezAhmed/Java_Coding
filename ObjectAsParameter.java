class Student  {
    int rollNo = 123;
    double marks = 78.9;
    String name = "abcd";
}
class ObjectAsParameter  {
    void display(Student stu)  {
        System.out.println(stu.rollNo);
        System.out.println(stu.marks);
        System.out.println(stu.name);
    }
    public static void main(String[] args)  {
        Student st = new Student();
        ObjectAsParameter od = new ObjectAsParameter();
        od.display(st);
    }
}

