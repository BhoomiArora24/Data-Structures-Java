import java.util.Scanner;
public class Inverseno {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int p = 1;
        int no = 0;
        while(n != 0){
            int d = n % 10;
            no = (p * (int)Math.pow(10, d - 1)) + no;
            p++;
            n=n/10;
        }
        System.out.println(no);
    }
}
