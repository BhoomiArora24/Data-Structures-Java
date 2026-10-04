import java.util.Scanner;
public class deffTwoArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size of arr1 :");
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];

        for(int i = 0; i < n1; i++){
            System.out.println("Enter the value for index" + i + " :");
            arr1[i] = scn.nextInt();
        }

        System.out.println("Enter the size of arr2 :");
        int n2 = scn.nextInt();
        int[] arr2 = new int[n1];

        for(int i = 0; i < n2; i++){
            System.out.println("Enter the value for index" + i + " :");
            arr2[i] = scn.nextInt();
        }

        int[] result = new int[n1>n2 ? n1:n2];
        int c = 10;
        int d = 0;

        int i = arr1.length - 1;
        int j = arr2.length -1;
        int k = arr2.length -1;

        while(k > 0){
            if( arr1[i] < arr2[j]){
                arr1[i+1] -= 1;
                d = c + arr1[i];
                d -= arr2[j];
            }
            else{
                d = arr1[i] -  arr2[j];
            }
            result[k] = d;

            i--;
            j--;
            k--;
        }
        for(int val: result){
            System.out.println(val);
        }
    }
}