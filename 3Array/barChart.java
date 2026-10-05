import java.util.Scanner;

public class barChart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the no of digits you want to enter: ");
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter the value for index " + i + " : ");
            arr[i] = scn.nextInt();
        }

        int max = arr[0];
        for( int i = 0; i < n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println(max);

        for(int i = max; i >= 1 ; i--){
            for(int j = 0; j < arr.length; j++){
                if(arr[j] >= i){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    } 
}