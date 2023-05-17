class Persona {
    private String name = "Francisco";

    public void changeName(String newName) {
        // Esto se puede hacer siempre y cuando no exista un variable igual, pero se recomienda usar this
        name = newName;
    }

    public String getNombre() {
        return this.name;
    }
}




public class ArgumentoPorReferenciaPerson {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.changeName("Frank Marin");
        System.out.println("p. = " + p.getNombre());

        System.out.println("Test");
        test(p);
        System.out.println("p.getNombre() = " + p.getNombre());
    }
    
    public static void test(Persona p){
        p.changeName("Juanito");
    }
}
