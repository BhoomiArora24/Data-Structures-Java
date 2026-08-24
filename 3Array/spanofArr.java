import java.util.Scanner;

public class spanofArr {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter how many numbers you want to ask for: ");
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter number for "+ i + " index :");
            arr[i] = scn.nextInt(); 
        }

        int n1 = arr[0];
        int n2 = arr[0];

        for(int t = 0; t< arr.length; t++){
            if(n1 < arr[t]){
                n1 = arr[t];
            }
            if(n2 > arr[t]){
                n2 = arr[t];
            }
        }

        int span = (n1 - n2);
        System.out.println("Span of an array is : "+ span);
    }
}