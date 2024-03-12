import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        //Creation scanner object

        Scanner sc = new Scanner(System.in);

        //Inputs program

        System.out.println("Digita un numero");
        int fn = sc.nextInt();
        System.out.println("Digita otro numero");
        int sn = sc.nextInt();

        System.out.println("The result of multiplication is "+ (fn*sn));
    }
}
