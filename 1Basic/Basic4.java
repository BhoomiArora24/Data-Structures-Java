public class Basic4 {
    public static void main(String[] args){
        int x = 15;
        int y = 10;
        int sum = x + y;
        System.out.println("Sum is = " + sum);
        int v1 = x/y;
        int v2 = y/x;
        int v3 = x%y;
        int v4 = x*y;
        System.out.println("Division of x/y = " + v1);//this gives quotient only
        System.out.println("Division of y/x = " + v2);// this gives quotient only
        System.out.println("Modulus of x%y = " + v3);//this gives remainder
        System.out.println("Multiplication of x*y = " + v4);

        int exp = x * y / x + y;
        int exp2 = (x * y) / (x + y);
        System.out.println("Expression 1 = " + exp);
        System.out.println("Expression 2 = " + exp2);
    }
}
