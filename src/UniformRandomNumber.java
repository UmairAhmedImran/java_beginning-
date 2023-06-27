public class UniformRandomNumber {
    public static void main(String[] args) {
        // do same for min and for average just add than divide by 5.... task done
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();
        double f = Math.max(a,b);
        double g = Math.max(f,c);
        double h = Math.max(g,d);
        double i = Math.max(h,e);
        System.out.println(a + " " + b + " " + c + " " + d + " " + e);
        System.out.println(i);
    }
}
