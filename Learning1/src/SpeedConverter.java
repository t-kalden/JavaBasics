public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        double mph;
        if(kilometersPerHour < 0) {
            return -1;
        } else {
             mph = kilometersPerHour / 1.609;
        }
        return Math.round(mph);
    }
    public static void printConversion(double kmph) {
        long mph = toMilesPerHour(kmph);
        boolean valid = (mph == -1) ? true : false;
        if (valid) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kmph + " km/h = " + mph + " mi/h");
        }
    }
}
