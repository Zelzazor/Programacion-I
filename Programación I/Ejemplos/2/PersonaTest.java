public class PersonaTest{
    public static void main (String[] args){
        PersonaEjemplo p1 = new PersonaEjemplo();
        p1.nombre = "Juan";
        p1.apellido = "Soto";
        p1.edad = 58;
        p1.sexo = 'm';
        p1.comer();
        System.out.println(p1.nombre+" "+p1.apellido+" "+p1.edad+" "+p1.sexo);
        System.out.println(p1.saludar(p1.nombre));
    }
}