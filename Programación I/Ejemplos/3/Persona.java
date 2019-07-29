public class Persona{ 
    private String nombre;
    private int edad;
    private char sexo;
    
    public void setEdad(int edad){
        if (edad >= 0 && edad <= 110){
            this.edad = edad;
        }
        else{
            System.out.println("Valor fuera de rango!");
        }
    }

    public int getEdad(){
        return edad;
    }
}