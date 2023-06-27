public class Sqrt {
    public static void main(String[] args) {
        double EPS = 1E-15; //error tolerance 15 decimal
        double c = Double.parseDouble(args[0]);
        double t = c;
        System.out.println(EPS);
        while (Math.abs(t - c/t) > t*EPS)
            t = (c/t + t)/ 2.0;
        System.out.println(t);
    }
}
