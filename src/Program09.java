interface Room
{

    public interface Almirah
    {
        void almirah();
    }
}
class House implements Room.Almirah
{

    public void almirah()
    {
        System.out.println("Inside a Almirah");
    }
}
public class Program09 {
    public static void main(String[] args) {
        Room.Almirah rm = new House();
        rm.almirah();

    }
}
