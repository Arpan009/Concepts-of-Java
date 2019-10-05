

public class parent
{
    public void eat(){
        System.out.println("Parent is eating");
    }
    public void declare()
    {
        System.out.println("I am the parent");
    }
}
class Child extends parent
{
    int counter =1;
    public void eat()
    {
        System.out.println("Eating");
    }
}

