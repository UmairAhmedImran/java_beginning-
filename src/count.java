public class count {
    public static void main(String[] args) {
        int count = Integer.parseInt(args[0]);
        while (count < 10) {
            System.out.println(count);
            count = count + 1;
        }
    }
}
