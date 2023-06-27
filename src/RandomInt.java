public class RandomInt {
    public static void main(String[] args) {
        // using math.random generate a random integer from 0 to N.
        int n = Integer.parseInt(args[0]);
        double r = Math.random();
        int t = (int) (r * n);
        System.out.println(t);
    }
}
