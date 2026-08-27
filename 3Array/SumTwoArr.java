import java.util.Scanner;

public abstract class SumTwoArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size of arr1 :");
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];

        for(int i = 0; i < arr1.length; i++){
            System.out.println("Enter element for index " + i +" :");
            arr1[i] = scn.nextInt();
        }


        System.out.println("Enter the size of arr2 :");
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];

        for(int i = 0; i < arr2.length; i++){
            System.out.println("Enter element for index " + i +" :");
            arr2[i] = scn.nextInt();
        }

        
        int[] result = new int[n1 > n2? n1: n2];
        for(int i = 0; i < result.length; i++){
                result[i] = arr1[i] + arr2[i];
                System.out.print(result[i]);
        }
    }
}
