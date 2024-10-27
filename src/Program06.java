class LocalInner2
{
    int data = 35;
    void show()
    {
        int value = 30; // Earlier JDK 1.7 must include final keyword
        class Local
        {
            void msg()
            {
                System.out.println("The Outer field member :"+data+"\n The feild inside method : "+ value);
            }
        }
        Local l = new Local();
        l.msg();
    }
}
public class Program06 {
    public static void main(String[] args) {
        LocalInner2 i = new LocalInner2();
        i.show();
    }
}
