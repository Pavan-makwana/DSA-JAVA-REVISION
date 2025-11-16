public class SubArray {

    public static void printSubArray(int[] num) {
        int tsub = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i ; j < num.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                }
                tsub++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub array : " + tsub);
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 5 ,6};
        printSubArray(num);
    }
}
