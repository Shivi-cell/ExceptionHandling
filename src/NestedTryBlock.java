/* When any try block does not have a catch block for a particular exception,
    then the catch block of the outer (parent) try block are checked for that exception,
    and if it matches, the catch block of outer try block is executed.*/
public class NestedTryBlock {
    public static void main(String[] args) {
        // outer (main) try block
        try {
            //inner try block 1
            try {
                // inner try block 2
                try {
                    int arr[] = { 1, 2, 3, 4 };

                    //printing the array element out of its bounds
                    System.out.println(arr[10]);
                }
                // to handles ArithmeticException
                catch (ArithmeticException e) {
                    System.out.println("Arithmetic exception");
                    System.out.println(" inner try block 2");
                }
                finally {
                    System.out.println("first finally block");
                }
                System.out.println("rest of code 1");
            }
            // to handle ArithmeticException
            catch (ArithmeticException e) {
                System.out.println("Arithmetic exception");
                System.out.println("inner try block 1");
            }
            finally {
                System.out.println("second finally block");
            }
        }
        // to handle ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException e4) {
            System.out.print(e4);
            System.out.println(" outer (main) try block");
        }
        catch (Exception e5) {
            System.out.print("Exception");
            System.out.println(" handled in main try-block");
        }
        finally {
            System.out.println("third finally block");
        }
        System.out.println("rest of code");
    }
}
