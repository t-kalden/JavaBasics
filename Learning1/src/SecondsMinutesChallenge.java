

public class SecondsMinutesChallenge {
    public static void main(String[] args) {
        System.out.println( getDurationString(9));

    }
    public static String getDurationString ( int min, int sec){
        if (min >= 0 && sec >= 0 && sec <= 59) {
            int hr = min / 60;
            int minRem = min % 60;
            String hrFormat, minFormat, secFormat;
            if(hr < 10 ) {
                hrFormat = "0";
            } else {
                hrFormat = "";
            }
            if(min < 10){
                minFormat  = "0";
            } else {
                minFormat = "";
            }
            if(sec < 10) {
                secFormat = "0";
            } else {
                secFormat = "";
            }
            return hrFormat + hr + " hr " + minFormat + minRem + " min " + secFormat + sec + " sec";
        } else {
            return "Invalid Value";
        }
    }
    public static String getDurationString ( int sec){
        boolean validate = (sec >= 0) ? true : false;
        if (!validate) {
            return "Invalid Value";
        } else {
            int min = sec / 60;
            int secRem = sec % 60;
            return getDurationString(min, secRem);
        }
    }
}