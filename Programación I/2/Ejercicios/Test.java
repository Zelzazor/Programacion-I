public class Test{
    public static void main(String[] args){
        Persona p1 = new Persona();
        Calculadora calc = new Calculadora();
        ManejaCadenas cadena = new ManejaCadenas();
        /*                             Clase Persona                               */
        System.out.println("\nClase Persona\n");
        p1.nombre = "Felipe";
        p1.apellido = "Ramirez";
        p1.edad = 18;
        p1.sexo = 'm';
        System.out.print("Tu nombre es "+p1.nombre+" "+p1.apellido+", tienes "+p1.edad+" años y eres de sexo ");
        switch (p1.sexo){
            case 'm': System.out.print(" Masculino.\n"); break;
            case 'f': System.out.print(" Femenino.\n"); break;
            default: System.out.print(" Otro.\n"); break;
        }

        p1.comer();
        p1.dormir();
        p1.caminar();
        p1.correr();
        /*                         Fin Clase Persona                               */
        /*                         Clase Calculadora                               */
        System.out.println("\nClase Calculadora\n");
        double uno = 2, dos = 4, tres = 3, cuatro = 6;
        System.out.println(calc.sumar(uno,dos));
        System.out.println(calc.sumar(uno,dos,tres));
        System.out.println(calc.sumar(uno,dos,tres,cuatro));
        System.out.println(calc.restar(uno,dos));
        System.out.println(calc.restar(uno,dos,tres));
        System.out.println(calc.restar(uno,dos,tres,cuatro));
        System.out.println(calc.multiplicar(uno,dos));
        System.out.println(calc.multiplicar(uno,dos,tres));
        System.out.println(calc.multiplicar(uno,dos,tres,cuatro));
        System.out.println(calc.dividir(uno,dos));
        /*                     Fin Clase Calculadora                               */
        /*                       Clase ManejaCadenas                               */
        System.out.println("\nClase ManejaCadenas\n");
        String cad = "Hola gente, estas son palabras de ejemplo";
        System.out.println("La cadena al rev\u00E9s ser\u00EDa: " + cadena.reverso(cad));          
        System.out.println("La cadena sin vocales se leer\u00EDa as\u00ED: " + cadena.eliminaVocales(cad));
        System.out.println("En la cadena hay "+cadena.cuentaVocales(cad) + " vocales");
        System.out.println("En la cadena hay "+cadena.cuentaConsonantes(cad) + " consonantes");
        System.out.println("En la cadena hay "+cadena.cuentaPalabras(cad) + " palabras");
        /*                   Fin Clase ManejaCadenas                               */
    }
}