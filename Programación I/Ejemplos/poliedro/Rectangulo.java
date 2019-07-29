package poliedro;

public class Rectangulo extends Poligono{

    //Propiedades

    private double base;
    private double altura;

    //Constructor

    public Rectangulo(double base, double altura){
        super(4);
        this.base = base;
        this.altura = altura;
    }

    //Getters & Setters

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    //Métodos

    @Override
    public String toString() {
        return "Rectangulo: \n"+super.toString()+"\nAltura: "+altura+"\nBase: "+base;
    }

    @Override
    public double area() {
        return base * altura;
    }
}