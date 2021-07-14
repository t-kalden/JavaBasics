public class MinutesToYearAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long min) {
        boolean validate = (min < 0) ? true : false;
        if(validate) {
            System.out.println("Invalid Value");
        } else {
            long hr = min / 60;
            long day = hr / 24;
            long year = day / 365;
            long dayRem = day % 365;

            System.out.println(min + " min = " + year + " y " + dayRem + " d");
        }
    }
}
