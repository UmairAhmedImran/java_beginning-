//public class Debugging {
//    public static void main(String[] args) {
//        long n = Long.parseLong(args[0])
//        for (     i = 0; i<n; i++)
//        {
//            while( n % i == 0)
//                System.out.print(i + " ")
//                n = n/i
//        }
//    }
//}

public class Debugging {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        //  In for loop condition from i < n to i < n/i for better computation.
        for (int i = 2; i < n/i; i++) // 0 is not a factor and we want factor greater than 1
        {
            while(n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
//            System.out.println("TRACE " + i + " " + n); // to check error

        }
        if (n>1) System.out.println(n);
        else System.out.println();

    }
}

