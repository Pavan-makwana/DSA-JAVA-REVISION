public class ReverseArray {
    public static void reverseArr(int[] nums) {
        int first = 0, last = nums.length - 1;
        while (first < last) {
            int temp = nums[last];
            nums[last] = nums[first];
            nums[first] = temp;
            first++;
            last--;
        }

    }

    public static void main(String[] args) {
        int nums[] = { 1, 4, 5, 6, 4, 5, 2 };
        reverseArr(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
