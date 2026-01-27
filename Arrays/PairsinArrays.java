public class PairsinArrays {
    
    public static void main(String[] args) {
        int arr1 []= {1,2,3,4,5,4};
        int count =  0;
        for (int i : arr1) {
            for (int j = i +1 ;  j < arr1.length; j++) {
                System.out.println("Sub Array : ("+ i + " " +  j + ")");
                count++;
            }
        }
        System.out.println(count);
    }
}
