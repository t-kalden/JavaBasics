public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(getDaysInMonth(1,2020));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(getDaysInMonth(-1,2020));
        System.out.println(getDaysInMonth(2,-2020));
        System.out.println(getDaysInMonth(12,10000));
    }
    public static boolean isLeapYear(int year) {
        boolean valid = (year >= 1 && year <= 9999 ) ? true : false;
        if(valid) {
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    public static int getDaysInMonth(int month, int year) {
        boolean invalidMonth = (month < 1 && month> 12) ? true : false;
        boolean validYear = isLeapYear(year);
        int daysInMonth = 0;

        if (!invalidMonth) {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    if(validYear){
                        daysInMonth = 31;
                    } else {
                        daysInMonth = -1;
                    }
                    break;
                case 2 :
                    if(validYear) { daysInMonth = 29;}
                    else if(!validYear && year >= 1 && year <= 9999){ daysInMonth = 28; }
                    else { daysInMonth = -1; };
                    break;
                case 4: case 6: case 9: case 11:
                    if (validYear) {
                        daysInMonth = 30;
                    } else {
                        daysInMonth = -1;
                    }
                    break;
                default:
                    daysInMonth = -1;
            }
            return daysInMonth;
        } else {
            daysInMonth = -1;
            return daysInMonth;
        }
    }
}


