import java.util.*; 

public class InputOutput {
	public static void main(String[] args) {
        int marks[] = new int[100];

        // Input
        Scanner scn = new Scanner(System.in);

        marks[0] = scn.nextInt();
        marks[1] = scn.nextInt();   
        marks[2] = scn.nextInt();

        // Output
        System.out.println("Phy: " + marks[0]);
        System.out.println("Chem: " + marks[1]);
        System.out.println("Maths: " + marks[2]);

        System.out.println("Length of marks array: " + marks.length);
    }
}
