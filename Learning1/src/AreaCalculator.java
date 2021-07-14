public class AreaCalculator {
    public static void main(String[] args) {
        area(-10);
    }
    public static double area (double radius) {
        boolean validate = (radius < 0) ? true : false;
        if(validate) {
            System.out.println("Invalid Value");
            return -1;
        } else {
            double area = (radius * radius) * Math.PI;
            System.out.println(area);
            return area;
        }
    }
    public static double area(double x, double y) {
        boolean validate = (x < 0 || y < 0) ? true : false;
        if(validate) {
            System.out.println("Invalid Value");
            return -1;
        } else {
            double area = x * y;
            System.out.println(area);
            return area;
        }
    }
}
