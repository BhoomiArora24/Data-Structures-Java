import java.util.Scanner;

public class rotateno {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int nod = 0;
        int temp = n;
        while (temp != 0) {
            temp = temp / 10;
            nod++;
        }

        int no = 0;
        System.out.println(nod);
        while (n != 0) {
            if (k != 0) {
                int r = n % 10;
                no = no + r * (int) Math.pow(10, nod - 1);
                nod--;
                k--;
                n=n/10;
            }else{
                int q = n/10;
                no = no + q * (int) Math.pow(10, nod - 1);
                nod--;
                n=n/10;
            }
        }

    }
}
