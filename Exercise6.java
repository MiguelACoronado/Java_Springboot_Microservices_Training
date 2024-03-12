import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        //Creation scanner object

        Scanner sc = new Scanner(System.in);

        //Operations program

        System.out.println("Digita un numero");
        int firstNum = sc.nextInt();
        System.out.println("Digita otro numero");
        int secondNum = sc.nextInt();

        System.out.println("Result of the sum between "+firstNum+" and "+secondNum+" is "+ (firstNum+secondNum));
        System.out.println("Result of the rest between "+firstNum+" and "+secondNum+" is "+ (firstNum-secondNum));
        System.out.println("Result of the multiplication between "+firstNum+" and "+secondNum+" is "+ (firstNum*secondNum));
        System.out.println("Result of the division between "+firstNum+" and "+secondNum+" is "+ (firstNum/secondNum));
        System.out.println("Result of the mod between "+firstNum+" and "+secondNum+" is "+ (firstNum%secondNum));
    }
}
