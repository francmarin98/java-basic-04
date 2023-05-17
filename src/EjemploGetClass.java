import java.lang.reflect.Method;

public class EjemploGetClass {
    public static void main(String[] args) {

        String txt = "Hello World";
        System.out.println("txt = " + txt.getClass().getName());
        System.out.println("txt = " + txt.getClass().getSimpleName());
        System.out.println("txt = " + txt.getClass().getPackageName());

        for (Method m: txt.getClass().getMethods()) {
            System.out.println("m = " + m.getName());
        }



        Integer num = 34;
        Class intClass = num.getClass();

        System.out.println(intClass.getSuperclass());
        System.out.println(intClass.getSuperclass().getSuperclass());


    }
}
