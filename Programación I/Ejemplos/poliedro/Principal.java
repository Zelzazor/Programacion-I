package poliedro;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal{
    static ArrayList<Poligono> poligonos = new ArrayList<Poligono>();
    static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        llenarPoligono();
        mostrarResultados();
    }

    public static void llenarPoligono(){

        char respuesta;
        int menu = 0;

        do{

            System.out.println("\nDigite que poligono desea: 1-Triangulo 2-Rectangulo\n");
            menu = lector.nextInt();

        }while(menu < 1 || menu > 2);

        switch(menu){
            case 1:  llenarTriangulo();
                    break;

            case 2:  llenarRectangulo();
                    break;

            default: System.out.println("Invalido"); break;
        }

        do{
            System.out.println("\nDesea introducir otro poligono? (s/n)");
            respuesta = lector.next().charAt(0);

            if(respuesta == 's' || respuesta == 'S'){

                llenarPoligono();

            }
        }while(respuesta!='s'&& respuesta!='n');
    }

    public static void llenarTriangulo(){

        double base, altura;
        System.out.println("\nDigite la base del triangulo: ");
        base = lector.nextDouble();
        System.out.println("\nDigite la altura del triangulo: ");
        altura = lector.nextDouble();

        Triangulo triangulo = new Triangulo(base, altura);
        poligonos.add(triangulo);
    }

    public static void llenarRectangulo(){

        double base, altura;
        System.out.println("\nDigite la base del rectangulo: ");
        base = lector.nextDouble();
        System.out.println("\nDigite la altura del rectangulo: ");
        altura = lector.nextDouble();

        Rectangulo rectangulo = new Rectangulo(base, altura);
        poligonos.add(rectangulo);
    }

    public static void mostrarResultados(){
        for(Poligono poli: poligonos){
            System.out.println("\n"+poli.toString()+"\nArea: "+poli.area()+"\n");
        }
    }
}