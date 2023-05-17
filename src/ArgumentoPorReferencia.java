public class ArgumentoPorReferencia {
    public static void main(String[] args) {
        // En java  toda variable primitiva se pasa por valor

        int[] edades = {1,2,4};

        System.out.println("Inicio");
        
        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades = " + edades[i]);
        }

        System.out.println("antes de llamar a test");
        test(edades);

        System.out.println("Despues de llamar a test");
        for (int edade : edades) {
            System.out.println("edades = " + edade);
        }

        System.out.println("fin");
    }


    public static void test(int[] edadArr) {
        for (int i = 0; i < edadArr.length; i++) {
            edadArr[i] = edadArr[i] + 20;
        }
    }
}
