import java.util.Scanner;

public class DeffArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size of arr1:");
        int n1 = scn.nextInt();

        int[] arr1 = new int[n1];

        for(int i = 0; i < n1; i++){
            arr1[i] = scn.nextInt();
        }

        System.out.println("Enter the size of arr2:");
        int n2 = scn.nextInt();

        int[] arr2 = new int[n2];

        for(int i = 0; i < n1; i++){
            arr2[i] = scn.nextInt();
        }

        int[] result = new int[n1 > n2 ? n1 : n2];

    }
}