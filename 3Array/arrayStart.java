public class arrayStart {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 33;
        arr[1] = 47;
        arr[2] = 55;
        arr[3] = 23;
        arr[4] = 49;

        System.out.println(arr.length);

        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        int[] one = new int[3];
        one[0] =  5;
        one[1] = 17;
        one[2] = 15;

        int[] two = one;
        two[2] = 590;

        for (int i = 0; i<one.length; i++){
            System.out.println(one[i]);
        }

        for (int i = 0; i<two.length; i++){
            System.out.println(two[i]);
        }
    }
}