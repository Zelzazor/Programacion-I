import java.util.Scanner;

public class TestMenu{
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
       char menu = '0';
      while(menu != '4'){ //                Menú principal que hace selección a cada clase a probar
          System.out.println("Escriba la clase que desea utilizar \n1- Persona   2- Calculadora   3- ManejaCadenas   4- Salir");
        menu = lector.next().charAt(0);
        switch(menu){
            case '1':

            /*                       Clase Persona                                  */
            Persona p1 = new Persona();
            System.out.println("Escriba su nombre: ");
            p1.nombre = lector.next();
            System.out.println("Escriba su apellido: ");
            p1.apellido = lector.next();
            System.out.println("Escriba su edad");
            p1.edad = lector.nextInt();
            System.out.println("Diga su sexo. Debe ser m \u00F3 f.");
            p1.sexo = lector.next().charAt(0);

            if (p1.sexo == 'm' || p1.sexo == 'f'){

                System.out.print("Usted es "+p1.nombre+" "+p1.apellido+". Tiene "+p1.edad+" años y es de género ");

                switch(p1.sexo){
                    case 'm': System.out.print("Masculino. \n"); break;
                    case 'f': System.out.print("Femenino. \n"); break; 
                }

                System.out.println("Ahora, la ejecuci\u00F3n de cada m\u00E9todo.");
                p1.comer();
                p1.dormir();
                p1.caminar();
                p1.correr();

            } else{

                System.out.println("Sexo inv\u00E1lido. Debe ser m \u00F3 f.");

            }

            break;
            /*                    Fin Clase Persona                                */

            case '2': 

            /*                      Clase Calculadora                              */
            Calculadora calc = new Calculadora();
            char params = '1';

            while(params != '0'){
                double uno, dos, tres, cuatro;
                System.out.println("Seleccione cu\u00E1ntos par\u00E1metros quieres utilizar. \n2. 2 par\u00E1metros   3. 3 par\u00E1metros   4. 4 par\u00E1metros   0. Salir");
                params = lector.next().charAt(0);

                switch(params){

                    case '0': System.out.println("Gracias por utilizar"); break;
                    case '2': 
                    char options2 = '5';

                    while(options2 != '0'){
                        System.out.println("Seleccione la operaci\u00F3n. \n1. Suma   2. Resta   3. Multiplicaci\u00F3n   4. Divisi\u00F3n   0. Salir");
                        options2 = lector.next().charAt(0);
                        switch(options2){
                            case '1':
                            System.out.println("Escribe el primer par\u00E1metro.");
                            uno = lector.nextDouble();
                            System.out.println("Escribe el segundo par\u00E1metro.");
                            dos = lector.nextDouble();
                            System.out.println("El resultado de la suma es: "+ calc.sumar(uno, dos));
                            break;
                            case '2':
                            System.out.println("Escribe el primer par\u00E1metro.");
                            uno = lector.nextDouble();
                            System.out.println("Escribe el segundo par\u00E1metro.");
                            dos = lector.nextDouble();
                            System.out.println("El resultado de la resta es: "+calc.restar(uno, dos));
                            break;
                            case '3': 
                            System.out.println("Escribe el primer par\u00E1metro.");
                            uno = lector.nextDouble();
                            System.out.println("Escribe el segundo par\u00E1metro.");
                            dos = lector.nextDouble();
                            System.out.println("El resultado de la multiplicaci\u00F3n es: "+calc.multiplicar(uno, dos));
                            break;
                            case '4': 
                            System.out.println("Escribe el primer par\u00E1metro.");
                            uno = lector.nextDouble();
                            System.out.println("Escribe el segundo par\u00E1metro.");
                            dos = lector.nextDouble();
                            System.out.println("El resultado de la divisi\u00F3n es: "+calc.dividir(uno, dos));
                            break;
                            case '0': 
                            break;
                            default: System.out.println("Opci\u00F3n Inv\u00E1lida.");
                            break;
                        }
                    }
                    
                    
                    break;
                    case '3': 
                    char options3 = '4';

                    while(options3 != '0'){

                        System.out.println("Seleccione la operaci\u00F3n. \n1. Suma   2. Resta   3. Multiplicaci\u00F3n   0. Salir");
                        options3 = lector.next().charAt(0);
                        switch(options3){
                            case '1': 
                            System.out.println("Escribe el primer par\u00E1metro.");
                            uno = lector.nextDouble();
                            System.out.println("Escribe el segundo par\u00E1metro.");
                            dos = lector.nextDouble();
                            System.out.println("Escribe el tercer par\u00E1metro.");
                            tres = lector.nextDouble();
                            System.out.println("El resultado de la suma es: "+calc.sumar(uno, dos, tres));
                            break;
                            case '2': 
                            System.out.println("Escribe el primer par\u00E1metro.");
                            uno = lector.nextDouble();
                            System.out.println("Escribe el segundo par\u00E1metro.");
                            dos = lector.nextDouble();
                            System.out.println("Escribe el tercer par\u00E1metro.");
                            tres = lector.nextDouble();
                            System.out.println("El resultado de la resta es: "+calc.restar(uno, dos, tres));
                            break;
                            case '3': 
                            System.out.println("Escribe el primer par\u00E1metro.");
                            uno = lector.nextDouble();
                            System.out.println("Escribe el segundo par\u00E1metro.");
                            dos = lector.nextDouble();
                            System.out.println("Escribe el tercer par\u00E1metro.");
                            tres = lector.nextDouble();
                            System.out.println("El resultado de la multiplicaci\u00F3n es: "+calc.multiplicar(uno, dos, tres));
                            break;
                            case '0': 
                            break;
                            default: System.out.println("Opci\u00F3n Inv\u00E1lida.");
                            break;
                        }
                    }
                    break;
                    case '4':
                    char options4 = '4';

                    while(options4 != '0'){

                        System.out.println("Seleccione la operaci\u00F3n. \n1. Suma   2. Resta   3. Multiplicaci\u00F3n   0. Salir");
                        options4 = lector.next().charAt(0);
                        switch(options4){
                            case '1':
                            System.out.println("Escribe el primer par\u00E1metro.");
                            uno = lector.nextDouble();
                            System.out.println("Escribe el segundo par\u00E1metro.");
                            dos = lector.nextDouble();
                            System.out.println("Escribe el tercer par\u00E1metro.");
                            tres = lector.nextDouble();
                            System.out.println("Escribe el cuarto par\u00E1metro.");
                            cuatro = lector.nextDouble();
                            System.out.println("El resultado de la suma es: "+calc.sumar(uno, dos, tres, cuatro)); 
                            break;
                            case '2': 
                            System.out.println("Escribe el primer par\u00E1metro.");
                            uno = lector.nextDouble();
                            System.out.println("Escribe el segundo par\u00E1metro.");
                            dos = lector.nextDouble();
                            System.out.println("Escribe el tercer par\u00E1metro.");
                            tres = lector.nextDouble();
                            System.out.println("Escribe el cuarto par\u00E1metro.");
                            cuatro = lector.nextDouble();
                            System.out.println("El resultado de la resta es: " + calc.restar(uno, dos, tres, cuatro)); 
                            break;
                            case '3': 
                            System.out.println("Escribe el primer par\u00E1metro.");
                            uno = lector.nextDouble();
                            System.out.println("Escribe el segundo par\u00E1metro.");
                            dos = lector.nextDouble();
                            System.out.println("Escribe el tercer par\u00E1metro.");
                            tres = lector.nextDouble();
                            System.out.println("Escribe el cuarto par\u00E1metro.");
                            cuatro = lector.nextDouble();
                            System.out.println("El resultado de la multiplicaci\u00F3n es: "+calc.multiplicar(uno, dos, tres, cuatro)); 
                            break;
                            case '0': 
                            break;
                            default: System.out.println("Opci\u00F3n Inv\u00E1lida.");
                            break;
                        }
                    } 
                    break;
                    default: System.out.println("Opci\u00F3n Inv\u00E1lida.");
                    break;

                }
            }
    
            break;
            /*                        Fin Clase Calculadora                                            */
            case '3': 
            /*                         Clase ManejaCadenas                                             */
            ManejaCadenas cadenas = new ManejaCadenas();
            char selection = '6';
            String cadena = "";
            while (selection != '0'){
                System.out.println("Seleccione la acci\u00F3n que debe realizar.\n1. Revertir cadenas   2. Eliminar vocales de cadenas   3. Contar vocales de cadenas   4. Contar consonantes de cadenas\n5. Contar palabras de cadenas   0. Salir");
                selection = lector.next().charAt(0);
                switch(selection){
                    case '0': break;
                    case '1': 
                    System.out.println("Escriba con el teclado lo que desee: ");
                    cadena = lector.nextLine(); //Pongo nextLine dos veces
                    cadena = lector.nextLine();
                    System.out.println("El reverso de lo escrito es: "+cadenas.reverso(cadena));
                    break;
                    case '2':
                    System.out.println("Escriba con el teclado lo que desee: ");
                    cadena = lector.nextLine();
                    cadena = lector.nextLine();
                    System.out.println("Lo escrito con las vocales eliminadas ser\u00EDa: "+cadenas.eliminaVocales(cadena));
                    break;
                    case '3':
                    System.out.println("Escriba con el teclado lo que desee: ");
                    cadena = lector.nextLine();
                    cadena = lector.nextLine();
                    System.out.println("En lo escrito hay "+cadenas.cuentaVocales(cadena)+" vocales.");
                    break;
                    case '4':
                    System.out.println("Escriba con el teclado lo que desee: ");
                    cadena = lector.nextLine();
                    cadena = lector.nextLine();
                    System.out.println("En lo escrito hay "+cadenas.cuentaConsonantes(cadena)+" consonantes.");
                    break;
                    case '5':
                    System.out.println("Escriba con el teclado lo que desee: ");
                    cadena = lector.nextLine();
                    cadena = lector.nextLine();
                    System.out.println("En lo escrito hay "+cadenas.cuentaPalabras(cadena)+" palabras.");
                    break;
                    default: System.out.println("Opci\u00F3n Inv\u00E1lida.");
                    break;
                }
            }
            break;
            /*                      Fin Clase ManejaCadenas                                       */
            case '4': System.out.println("Gracias por utilizar.");
            break;
            default: System.out.println("Opci\u00F3n Inv\u00E1lida.");
            break;        
        }
      }
      lector.close();
    }
}