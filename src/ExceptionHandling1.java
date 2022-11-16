public class ExceptionHandling1 {

    public static void main(String[] args) {

        try
        {
            int data1=50/0; //may throw exception
        }
        // handling the exception
        catch(ArithmeticException e)
        {
            // generating the exception in catch block
            try
            {
                int data2=50/0; //may throw exception
            }
             catch (Exception abc)
             {
                 System.out.println("Exception handled 1.0");
             }
        }
        catch (Exception e)
        {
            System.out.println("Exception handled..");
        }
        System.out.println("rest of the code");
    }
}