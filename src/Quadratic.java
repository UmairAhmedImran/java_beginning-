public class Quadratic {
    public static void main(String[] args) {
        // to calculate roots of x*2 + bx + c
        // take arguments from command-line
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);
        double discriminant = b*b - 4.0*c;
        double d = Math.sqrt(discriminant);
        double root1 = (-b + d) / 2.0;
        double root2 = (-b -d) / 2.0;
        System.out.println(root1);
        System.out.println(root2);
    }
}
