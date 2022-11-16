import java.io.IOException;


// By default, Checked Exceptions are not forwarded in calling chain (propagated).
public class ExceptionPropagationChecked {
    void m() throws IOException
    {
        throw new java.io.IOException("device error");//checked exception
    }
    void n() throws IOException {
        m();
    }
    void p()
    {
        try{
            n();
        }
        catch (IOException e)
        {
            System.out.println("caught in IOException");
        }
    }
    public static void main(String args[]){
        ExceptionPropagationChecked obj=new ExceptionPropagationChecked();
       obj.p();
        System.out.println("normal flow");
    }
}
