public class ArreglosTest{
    public static void main(String[] args) {
        Arreglos a = new Arreglos();

        //Ejercicio 1

        int [] arr = new int[5]; 
        arr[0] = 29;
        arr[1] = 54;
        arr[2] = 43;
        arr[3] = 93;
        arr[4] = 59;
        System.out.println("EJERCICIO 1\n");
        System.out.println("El arreglo es: \n"+a.getDatos(arr)+"\n");  
        System.out.println("La suma de cada elemento es igual a: \n"+a.SumaArreglo(arr)+"\n");  

        //Ejercicio 2

        int [] arr2 = new int[5]; 
        arr2[0] = 75;
        arr2[1] = 54;
        arr2[2] = 38;
        arr2[3] = 28;
        arr2[4] = 14;
        System.out.println("\nEJERCICIO 2\n");
        System.out.println("El arreglo es: \n"+a.getDatos(arr2)+"\n");
        a.InversoArreglo(arr2);
        System.out.println("El inverso del arreglo es: \n"+a.getDatos(arr2)+"\n");

        //Ejercicio 3

        int [][] arr3 = new int[2][2]; 
        arr3[0][0] = 72;
        arr3[0][1] = 54;
        arr3[1][0] = 38;
        arr3[1][1] = 28;

        System.out.println("\nEJERCICIO 3\n");
        System.out.println("La matriz es: \n"+a.getDatosMatriz(arr3));
        a.InversoMatriz(arr3);
        System.out.println("La matriz invertida es: \n"+a.getDatosMatriz(arr3));

        //Ejercicio 4

        int[] arr4 = {14, 78, 54, 33, 94};
        int[] arr5 = {85, 36, 43, 53, 29};
        int[] arr6 = new int[10];
        System.out.println("\nEJERCICIO 4\n");
        System.out.println("El arreglo 1 es: \n"+a.getDatos(arr4)+"\n");
        System.out.println("El arreglo 2 es: \n"+a.getDatos(arr5)+"\n");
        a.concatarreglo(arr4, arr5, arr6);
        System.out.println("El arreglo combinado es: \n"+a.getDatos(arr6)+"\n");
        a.bubbleSort(arr6);
        System.out.println("El arreglo combinado ordenado por BubbleSort es: \n"+a.getDatos(arr6)+"\n");

        //Ejercicio 5

        int[] arr7 = new int[10];
        a.setRandom(arr7);
        System.out.println("\nEJERCICIO 5\n");
        System.out.println("El arreglo obtenido es: \n"+a.getDatos(arr7)+"\n");
        a.quickSortReturnAscendente(arr7);
        System.out.println("El arreglo ordenado de forma ascendente con QuickSort es: \n"+a.getDatos(arr7)+"\n");
        a.quickSortReturnDescendente(arr7);
        System.out.println("El arreglo ordenado de forma desscendente con QuickSort es: \n"+a.getDatos(arr7)+"\n");

        //Ejercicio 6

        int[][] arr8 = {{32,53,73},{36,54,32},{43,36,85}};
        int[][] arr9 = {{43,62,94},{87,30,12},{23,48,81}};

        System.out.println("\nEJERCICIO 5\n");
        System.out.println("La matriz 1 es: \n"+a.getDatosMatriz(arr8));
        System.out.println("La matriz 2 es: \n"+a.getDatosMatriz(arr9));
        a.sumaMatrices(arr8, arr9);
        System.out.println("La matriz resultante es: \n"+a.getDatosMatriz(arr8));
    }
}