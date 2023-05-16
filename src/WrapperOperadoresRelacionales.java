public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("(num1 == num2) = " + (num1 == num2));

        num2 = 1200;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("(num1 == num2) = " + (num1 == num2));
        System.out.println("num1.equals(num2) = " + num1.equals(num2));
        System.out.println("num1.equals(num2) = " + (num1.intValue()== num2.intValue()));

        // En Java hasta maximo 127 compara de forma automatica  por valor, a pesar de que sean instancias.

        boolean condicion = num1 > num2;
    }
}
