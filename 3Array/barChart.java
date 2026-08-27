import java.util.Scanner;

public class barChart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no of inputs you want to ask for: ");
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<arr.length; i++){
            System.out.println("Enter the no for index " + i + " :");
            arr[i] = scn.nextInt();
        }

        int max = arr[0];

        for(int i = 1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for(int i = max; i >= 1; i--){
            for(int j = 0; j < arr.length; j++){
                if(arr[j] >= i){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

        // for(int i = 0; i < arr.length; i++){
        //     for(int j = 0; j < arr[i]; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
}