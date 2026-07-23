import java.util.Scanner;
public class digitinNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int dig = 0;
        int temp = n;
        while (temp != 0){
            temp = temp/10;
            dig++;
        }

        int div = (int)Math.pow(10, dig - 1);
        while(div != 0){
            int q = n/div;
            System.out.println(q);
            n = n%div;
            div = div/10;
        }
}

}
