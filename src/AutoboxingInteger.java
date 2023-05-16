public class AutoboxingInteger {
    public static void main(String[] args) {
        /*
         * En Java, el autoboxing se refiere a la conversión automática de tipos primitivos en sus respectivos tipos de envoltura (wrapper) correspondientes. Esto significa que Java puede convertir automáticamente un tipo primitivo, como un entero (int), en su clase de envoltura equivalente, como Integer, cuando sea necesario

         * Por otro lado, el unboxing es la operación inversa del autoboxing. Se refiere a la conversión automática de los tipos de envoltura (wrapper) en sus tipos primitivos correspondientes. Es decir, cuando se necesita un tipo primitivo y se tiene un tipo de envoltura, Java puede desempaquetar automáticamente el valor del tipo de envoltura y convertirlo en su tipo primitivo equivalente.

         * Estas características de autoboxing y unboxing en Java proporcionan conveniencia al permitir la conversión automática entre tipos primitivos y tipos de envoltura, evitando así la necesidad de realizar conversiones manuales en muchos casos.
         */

        Integer[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int suma = 0;

        for(Integer i: enteros){
            if(i % 2 == 0){
                suma += i;
            }
        }

        System.out.println("suma = " + suma);

    }
}
