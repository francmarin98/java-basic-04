public class WrapperBoolean {
    public static void main(String[] args) {
        Integer numb1, numb2;
        numb1 = 1;
        numb2 = 2;

        boolean primerBoolean = numb1 > numb2;
        Boolean ob2 = Boolean.valueOf(primerBoolean);
        Boolean ob = Boolean.valueOf("false");

        System.out.println("primerBoolean = " + primerBoolean);
        System.out.println("ob2 = " + ob2);
        System.out.println("ob = " + ob);

        System.out.println("(ob == ob2) = " + (ob == ob2));

        boolean x = ob2.booleanValue();
        System.out.println("x = " + x);
    }
}
