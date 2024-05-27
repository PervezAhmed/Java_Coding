class  Customer  {
    int custId = 1234;
    String name="pqrs";
}
class  ReturnObject  {
    public static Customer getObject()  {
        Customer c1= new Customer();
        c1.custId=9876;
        c1.name="abcd";
        return c1;
    }
    public static void main(String[] args)  {
        //ReturnObject od = new ReturnObject();
        Customer c2 = getObject();
        System.out.println(c2.custId);
        System.out.println(c2.name);
    }
}
