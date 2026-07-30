import java.util.Scanner;

public class rotateno {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int nod = 0;
        int temp = n;
        while(temp!=0){
            temp = temp/10;;
            nod++;
        }
        System.out.println(nod);

        int res = 0;

        k %= nod;

        if(k<0){
            k += nod;
        }

        int dig = nod;
        while(n!=0){
            int r = n%10;
            n=n/10;
            if(k!=0){
                res = res + (r * (int)Math.pow(10, nod - k));
                k--;
            }else{
                res = res + (r * (int)Math.pow(10, nod - dig));
                dig--;
            }
        }
        System.out.println(res);
    }
}
