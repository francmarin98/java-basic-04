public class WrapperInteger {
    public static void main(String[] args) {
        Integer intObjeto0 = new Integer(100); // Deprecated

        int intPrimitivo = 100; // Forma primitiva
        System.out.println("intPrimitivo = " + intPrimitivo);

        Integer intObjeto = Integer.valueOf(100); // Forma explicita
        Integer intObjeto2 = 100; // Forma implicita

        int num = intObjeto; // Implicita
        int num2 = intObjeto.intValue(); // Explicita


        String intString = "100";
        Integer valor = Integer.valueOf(intString);
        System.out.println("valor = " + valor);

        Short shortObjet = intObjeto2.shortValue();
        System.out.println("shortObjet = " + shortObjet);

        Byte example = valor.byteValue();
        System.out.println("example = " + example);
    }

}
