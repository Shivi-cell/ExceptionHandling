class CustomException extends Exception
{
    // without parameterized constructor
    // this will internally call the default constructor
}
public class ThrowingUserDefinedException2 {
    public static void main(String[] args) {
        try{
            throw new CustomException();
        }
        catch (CustomException e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}
