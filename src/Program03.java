abstract class Admin
{
    abstract void member();
}
public class Program03 {
    public static void main(String[] args) {
        Admin a = new Admin()
        {
            @Override
            void member()
            {
                System.out.println("Access Denied : ");
            }
        };
        a.member();
    }
}
