public class UncheckedException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = a/b;  // this is arithmatic exception this will be checked on runtime
        System.out.println(c);
    }
}
