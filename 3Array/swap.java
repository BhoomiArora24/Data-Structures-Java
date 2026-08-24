public class swap {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        
        arr[0] = 45;
        arr[1] = 90;
        arr[2] = 32;
        arr[3] = 76;
        arr[4] = 64;

        swap(arr, 0, 4);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
