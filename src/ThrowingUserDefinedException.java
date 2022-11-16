class UserDefinedException extends Exception
{
    public UserDefinedException(String str) {
        super(str);
    }
}
public class ThrowingUserDefinedException {
    public static void main(String[] args) {
        try {
            throw new UserDefinedException("this is my custom exception");
        }
        catch (UserDefinedException e)
        {
            e.printStackTrace();
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        System.out.println("Rest of code");
    }
}
