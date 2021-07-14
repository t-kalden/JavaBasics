public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, -1));
    }
    public static boolean shouldWakeUp ( boolean bark, int hr) {
        boolean time = (hr < 8 || hr > 22 ) ? true : false;
        boolean tod = (hr < 0 || hr > 23) ? true : false;
        if(bark && time && !tod) {
            return true;
        } else {
            return false;
        }
    }
}
