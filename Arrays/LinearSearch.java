public class LinearSearch{
    public static int linearSearch(int num[] ,int key ){
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int num[] = {1,34,5,32,56,20};
        int key = 20;
        System.out.println("Index of The Key :"+linearSearch(num,key));
    }
}