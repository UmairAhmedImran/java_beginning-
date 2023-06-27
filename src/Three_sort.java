public class Three_sort {
    public static void main(String[] args) {
        // take 3 input from command line and print in ascending order.
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Math.max(a,b);
        int e = Math.max(d,c);
        int f = Math.min(a,b);
        int g = Math.min(f,c);
        System.out.println(e);
        System.out.println(g);
    }
}
