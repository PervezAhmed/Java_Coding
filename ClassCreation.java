class Animal{
    private String name;
    public void eating()
    {
        System.out.println("Eating");
    }
    public void barking()
    {
        System.out.println("Barking");
    }
    public void sleeping()
    {
        System.out.println("Sleeping");
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
}


public class ClassCreation {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.setName("Simba");
        // dog.barking();
        // dog.eating();
        // dog.sleeping();
        String name = dog.getName();
        System.out.println(name);
    }
}
