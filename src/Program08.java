class OuterClass2
{
    static int data = 40;
    static class InnerClass
    {
         void show()
        {
            System.out.println("The data is : "+data);
        }
    }
}
public class Program08 {
    public static void main(String[] args) {
        OuterClass2.InnerClass obj = new OuterClass2.InnerClass();
        obj.show();

    }
}
