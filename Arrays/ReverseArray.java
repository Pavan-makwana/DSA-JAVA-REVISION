public class ReverseArray {

    public static void reverseArray(int num []) {
        int first = 0, last = num.length -1 ;
        while (first < last) {
            // swap
            int temp = num[last];
            num[last] = num[first];
            num[first]= temp;
            
            first++;
            last--;

        }
    }

    public static void main(String[] args) {
        int numbers [] = {1,2,3,4,5};
        reverseArray(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}