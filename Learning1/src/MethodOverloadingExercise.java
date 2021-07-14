public class MethodOverloadingExercise {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(-10));
    }
    public static double calcFeetAndInchesToCentimeters (double ft, double in) {
        boolean validate = (ft < 0 || in < 0 && in > 12) ? true : false;
        if(validate) {return -1;}
        else {
            double cm = ((ft * 30.48) + (in * 2.54));
            return cm;
        }
    }
    public static double calcFeetAndInchesToCentimeters (double in) {
        boolean validate = (in > 0) ? true : false;
        if(!validate) {
            return -1;
        } else {
            int ft = (int) (in / 12);
            int rem = (int) in % 12;
            return calcFeetAndInchesToCentimeters(ft, rem);
        }
    }
}
