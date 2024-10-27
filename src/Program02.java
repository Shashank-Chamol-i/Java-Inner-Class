abstract  class Person
{
    abstract void eat();
}
public class Program02 {
    public static void main(String[] args) {
        Person p = new Person()
        {
            @Override
            void eat() {
                System.out.println("Eats Fruits : ");
            }
        };
        p.eat();
    }
}
