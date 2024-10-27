class Outerclass1
{
    int data = 30;
    class InnerClass
    {
        void msg()
        {
            System.out.println("The data is : "+ data);
        }
    }
}
public class Program01 {
    public static void main(String[] args) {
        Outerclass1 obj = new Outerclass1();
        Outerclass1.InnerClass obj1 = obj.new InnerClass();
        obj1.msg();
        System.out.println(obj.data);
    }
}
