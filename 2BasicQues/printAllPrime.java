import java.util.Scanner;

public class printAllPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Low :");
        int low = scn.nextInt();

        System.out.print("High :");
        int High = scn.nextInt();

        for (int i = low; i <= High; i++){
            int count = 0;
            for(int div = 2; div * div <= i; div++){
                if(i % div == 0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println(i);
            }
        }
    }
}
