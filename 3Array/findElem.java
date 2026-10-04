import java.util.Scanner;
public class findElem {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the digit you want to find : ");
        int d = scn.nextInt();

        System.out.println("Enter the no of digits that you want to store in an array: ");
        int n = scn.nextInt();

        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            System.out.println("Enter the value for index" +  i);
            arr[i] = scn.nextInt();

        }

        System.out.println(FindElement(arr,d));
    }

    public static int FindElement(int[] arr, int d){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == d){
                return i;
            }
        }
        return -1;
    }
}