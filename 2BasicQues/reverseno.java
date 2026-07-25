import java.util.Scanner;
public class reverseno {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int nod = 0;
        while(n!= 0){
            n=n/10;
            nod++;
        }

        int r = 0;
        for (int i = 0; i<=k; i++){
            r = n%10;
            n=n/10;
            System.out.println(r);
        }
        
        }
    }
