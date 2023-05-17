public class ArgumentoPorValor {
    public static void main(String[] args) {
        // En java  toda variable primitiva se pasa por valor

        int i = 10;
        Integer j = 220;

        System.out.println("i = " + i);
        test(i);
        test2(j);
        System.out.println("j = " + j);

    }


    public static void test(int i) {
        i = 69;
        System.out.println("x = " + (i + 1));
    }

    public static void test2(int j) {
        j = 68;
        System.out.println("j = " + (j + 1));
    }
}
