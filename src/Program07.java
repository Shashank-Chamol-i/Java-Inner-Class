class OuterClass
{
    static int data = 40;
    static class InnerClass
    {
        static void show()
        {
            System.out.println("The data is : "+data);
        }
    }
}
public class Program07 {
    public static void main(String[] args) {
        OuterClass.InnerClass.show();
        OuterClass o = new OuterClass();
        
    }
}
