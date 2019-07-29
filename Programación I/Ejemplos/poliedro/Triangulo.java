package poliedro;

public class Triangulo extends Poligono{

    //Propiedades

    private double base;
    private double altura;

    //Constructor

    public Triangulo(double base, double altura){
        super(3);
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
        return "Triangulo: \n"+super.toString()+"\nAltura: "+altura+"\nBase: "+base;
    }

    @Override
    public double area() {
        return (base * altura)/2;
    }
}