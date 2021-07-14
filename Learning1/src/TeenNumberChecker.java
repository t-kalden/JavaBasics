public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));

        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }
    public static boolean hasTeen (int x, int y, int z) {
        int[] arr = {
                x,
                y,
                z
        };

        for(int i = 0; i < arr.length;){
            if(arr[i] >=13 && arr[i] <= 19) {
                return true;
            } else {
                i++;
            }
        }

        return false;
    }

    public static boolean isTeen(int x) {
        boolean valid = (x >= 13 && x <= 19) ? true : false;

        if(valid) {return true;}
        return false;
    }
}
