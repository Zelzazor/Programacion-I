public class PersonaEjemplo { 
    String nombre;
    String apellido;
    int edad;
    char sexo;

    public void caminar(){
        System.out.println("Caminando.");
    }

    public void comer(){
        System.out.println("Comiendo.");
    }

    public void dormir(){
        System.out.println("Durmiendo.");
    }

    public String saludar(String nombre){
        return "Hola, "+nombre;
    }
}