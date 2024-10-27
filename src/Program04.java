interface Eatable
{
    abstract void type();
}
public class Program04 {
    public static void main(String[] args) {
        Eatable e = new Eatable()
        {
            @Override
            public void type()
            {
                System.out.println("Fruits : Vegitable ");
            }
        };
        e.type();
    }
}
