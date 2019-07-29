class Bebe extends Persona{
    //Atributos
    private int EdadMeses;
    //Constructor
    public Bebe(int EdadMeses, int Edad){
        super();
        this.EdadMeses = EdadMeses;
        setEdad(Edad);
        System.out.println("--------Bebe--------");
    }

    public Bebe(){
        super();
        setEdad(0);
        System.out.println("--------Bebe--------");
    }
    //Setters y Getters
    public void setEdadMeses(int EdadMeses){
        if(EdadMeses > 0 && EdadMeses < 12){
            this.EdadMeses = EdadMeses;
        }
    }

    public int getEdadMeses(){
        return EdadMeses;
    }

    //Métodos

    public String caminar(){
        return "Gateando";
    }

    public String hablar(){
        return "Balbuceando.";
    }

    public String Datos(){
       return super.Datos()+"\nEdad (en meses): "+getEdadMeses();
    }

}