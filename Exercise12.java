import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el primer numero");
        int a = sc.nextInt();
        System.out.println("Digite el segundo numero");
        int b = sc.nextInt();
        System.out.println("Digite el tercer numero");
        int c = sc.nextInt();
        System.out.println("Digite el tercer numero");
        int d = sc.nextInt();
        System.out.println("Digite el tercer numero");
        int e = sc.nextInt();

        System.out.println("Average of five numbers is: " + (a+b+c+d+e) / 5);

        /**
         * if (a>b && a>c){
         *             System.out.println("El numero mayor es "+ a);
         *         }else if(b>a && b>c){
         *             System.out.println("El numero mayor es "+ b);
         *         } else if (c>a && c>b) {
         *             System.out.println("El numero mayor es "+ c);
         *         }else {
         *             System.out.println("los numeros son iguales");
         *         }
         */



    }



}
