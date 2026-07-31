import java.util.Scanner;

public class gcdnlcm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        int sm = 0;

        if (num1 < num2) {
            sm = num1;
        } else {
            sm = num2;
        }

        int GCD = 0;
        int LCM = 0;

        while (num1 != 1 && num2 != 1) {

            for (int i = 2; i < sm; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    num1 /= i;
                    num2 /= i;
                    LCM = i 
                }
            }
        }
    }
}