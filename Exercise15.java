public class Exercise15 {
    public static void main(String[] args) {
        int a, b, temp;

        a = 15;
        b = 27;

        // antes del cambio
        System.out.println("Antes del cambio : a, b = " + a + ", " + b);

        // usando la variable temporal
        temp = a;
        a = b;
        b = temp;

        // despues del cambio
        System.out.println("Despues del cambio : a, b = " + a + ", " + b);

    }
}
