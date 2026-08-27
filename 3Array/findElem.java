import java.util.Scanner;
public class findElem {
    public static int findElem(int[] arr, int d){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == d){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of inputs you want to ask for: ");
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter no for index " + i + " :");
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter the no you want to check for: ");
        int d = scn.nextInt();

        System.out.println(findElem(arr, d));
    }
}