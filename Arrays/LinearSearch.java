

public class LinearSearch {
    public static int linearSearch(int [] numbers,int key ) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,5,8,25,3,53,32};
        int key = 3;
        int idx = linearSearch(numbers, key);
        if (idx ==0) {
            System.out.println("key is not in the Array " );
        } else {
            System.out.println("key is at " + idx );
        }
    }
}
