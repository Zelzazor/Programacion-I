import java.util.Scanner;
public class calculadoraTest{
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        Calculadora c = new Calculadora();
        System.out.println("Escriba los sumandos");
        int resultadoS = c.suma(lector.nextInt(),lector.nextInt());
        System.out.println("Escriba el minuendo y el sustraendo");
        int resultadoR = c.resta(lector.nextInt(),lector.nextInt());
        System.out.println("El resultado de la suma es "+resultadoS);
        System.out.println("El resultado de a resta es "+resultadoR);
        lector.close();
    }

}