public class LeapYear {
    public static void main(String[] args) {
        //is given year a leap year?
        //yes if, Either it is divisible by 400 or divisible by 4 but not 100.
        double year = Double.parseDouble(args[0]);
        boolean isLeapYear;

        // divisible by 4 but not 100
        isLeapYear = (year % 4 == 0) && (year % 100 != 0);

        // or divisible by 400
        isLeapYear = isLeapYear || (year % 400 == 0);

        System.out.println(isLeapYear);
    }
}
