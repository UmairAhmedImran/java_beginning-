public class Exchange2 {
    public static void main(String[] args) {
        // In this code there are two arguments that is passed through with program that is why it will run in
        // terminal but will not run.
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int t = a;
        a = b;
        b = t;
        System.out.println(a);
        System.out.println(b);
    }
}
// reads two strings from command-line that can be converted into integers and then prints them out in opposite order