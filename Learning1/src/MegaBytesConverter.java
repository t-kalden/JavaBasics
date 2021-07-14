public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        boolean valid = (kiloBytes < 0) ? true : false;

        if(valid) {
            System.out.println("Invalid Value");
        } else {
            int mb = kiloBytes / 1000;
            int kb = kiloBytes % 1000;
            System.out.println( kiloBytes + " KB = " + mb +" MB and " + kb + " KB");
        }

    }

}
