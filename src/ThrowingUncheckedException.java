public class ThrowingUncheckedException {
    public static void validate(int age)
    {
        if (age < 18)
        {
            throw new ArithmeticException("Person is not eligible to vote");
        }
        else {
            System.out.println("Welcome and vote");
        }
    }

    public static void main(String[] args) {
        //try{
            validate(10);
       // }
        /*catch (ArithmeticException e)
        {
            System.out.println(e);
        } */
        System.out.println("voting continued...");
    }
}
