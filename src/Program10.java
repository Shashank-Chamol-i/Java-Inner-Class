class Room1
{
    interface Almirah1
    {
        void show();
    }
}
class House01 implements Room1.Almirah1
{
    public void show()
    {
        System.out.println("Inside the Almirah : ");
    }
}
public class Program10 {
    public static void main(String[] args) {
        Room1.Almirah1 obj = new House01();
        obj.show();
    }
}
