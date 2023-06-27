public class Array {
    public static void main(String[] args) {
        double[] a = new double[1000];
        double[] x = {0.3,0.5,0.9};
        double[] b = new double[x.length];
//        b = x; // means b and x points to the same array in the memory.
        for (int i = 0; i < x.length; i++) { // code to copy an array
            b[i] = x[i];
            System.out.println(b[i] + " " + x[i]);
        }

    }
}
