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
        int c = 0;

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = result.length -1;

        while(k >= 0){
            int d = c;

            if(i >= 0){
                d += arr1[i];
            }

            if(j >= 0){
                d += arr2[j];
            }

            c = d/10;
            d = d%10;

            result[k] = d;

            i--;
            j--;
            k--;
        }

        if(c != 0){
            System.out.println(c);
        }

        for(int val: result){
            System.out.println(val);
        }
    }
}
