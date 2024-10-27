
class LocalInner
{
    int data = 35;
    void display()
    {
        class Inner
        {
           void display()
           {
               System.out.println("The data is : "+data);
           }
        }
        Inner i = new Inner();
        i.display();
    }
}
public class Program05 {
    public static void main(String[] args) {
        LocalInner l = new LocalInner();
        l.display();
    }
}
