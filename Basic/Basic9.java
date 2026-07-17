import java.util.Scanner;
public class Basic9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);//scn is in dtype of scanner which is used to take input from user
        //System.in -- whatever the user is typing in the console(keyboard), it will be taken as input
        //only when weneed to get both int and string the we'll use parseInt'
        // int n = scn.nextInt();
        int n = Integer.parseInt(scn.nextLine());//parseInt is used to convert string to int because nextLine() will take input as string and we need to convert it to int
        String name = scn.nextLine();

        System.out.println("Dear" + name + " Here is your Counting:");
        for(int i = 0; i <= n; i++){
            System.out.println(i);
        }

    }
}
