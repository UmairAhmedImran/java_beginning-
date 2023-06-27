public class Exchange {
    public static void main(String[] args) {
        int a = 1234;
        int b = 99;
        int t = a;
        System.out.println(a);
        System.out.println(b);

        a = b;
        b = t;
        System.out.println(a);
        System.out.println(b);

    }
}
