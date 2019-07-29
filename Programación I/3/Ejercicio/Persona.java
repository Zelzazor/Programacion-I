class Persona {

    //Atributos
    private int edad;
    private String nombre;
    private String apellido;
    private char sexo;

    //Constructor
    public Persona(String nombre, String apellido, int edad, char sexo){
        System.out.println("--------Persona--------");
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(){
        System.out.println("--------Persona--------");
    }

    //Getters y Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setEdad(int edad){
        if (edad >= 0 && edad <= 100){ 
            this.edad = edad;
        }else{
            this.edad = 0;
        }
    }

    public void setSexo(char sexo){
        if(sexo == 'M' || sexo == 'F'){
            this.sexo = sexo;
        }
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public int getEdad(){
        return edad;
    }

    public char getSexo(){
        return sexo;
    }

    //Métodos
    public String caminar(){
        return "Caminando.";
    }

    public String respirar(){
        return "Respirando.";
    }

    public String comer(){
        return "Comiendo.";
    }

    public String hablar(){
        return "Hablando.";
    }

    public String Datos(){
        return "Nombre: "+getNombre()+"\nApellido: "+getApellido()+"\nEdad: "+getEdad()+"\nSexo: "+getSexo();
    }

}