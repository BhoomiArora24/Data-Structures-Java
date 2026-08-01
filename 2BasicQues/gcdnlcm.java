import java.util.Scanner;

public class gcdnlcm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        int divident = num1;
        int divisor = num2;

        while(divident%divisor != 0){
            int rem = divident%divisor;
            divisor = rem;
            divident = divisor;
        }

        int gcd = divident;

        System.out.println(gcd);

        int lcm = 0;

        lcm = (num1 * num2)/gcd;

        System.out.println(lcm);

    }
}