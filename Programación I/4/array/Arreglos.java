public class Arreglos{

    public String getDatos(int[] arreglo){

        String DataArreglo = "";

        for(int i = 0; i < arreglo.length;i++){
            
            if (i==(arreglo.length-2)){

                DataArreglo+= arreglo[i]+" y "; 

            }
            
            else if (i < arreglo.length-2){

            DataArreglo+= arreglo[i] + ", ";

            }

            else{

                DataArreglo+=arreglo[i] + ".";
            }
            
        }

        return DataArreglo;
    }

    public String getDatosMatriz(int[][] matriz){

        String DataMatriz = "";

        for (int i = 0; i < matriz[0].length; i++){

            for (int j=0; j < matriz[0].length; j++){

                DataMatriz+=matriz[i][j]+" ";

            }

            DataMatriz+="\n";

        }

        return DataMatriz;

    }

    //Ejercicio 1

    public int SumaArreglo(int[] arreglo){

        int sumaInt = 0;

        for (int i = 0; i<arreglo.length;i++){

            sumaInt+=arreglo[i];

        }

        return sumaInt;

    }


    //Ejercicio 2
    
    public void InversoArreglo(int[] arreglo){
        int aux;
        for (int i = 0; i < arreglo.length/2 ; i++){
            aux = arreglo[i];
            arreglo[i] = arreglo[arreglo.length-1-i];
            arreglo[arreglo.length-1-i] = aux;
        }

    }

    //Ejercicio 3

    public void InversoMatriz(int[][] matriz){
        int aux;
        for (int i = 0; i < matriz.length/2; i++){

            for(int j = 0; j < matriz[0].length; j++){

                aux = matriz[i][j];
                matriz[i][j] = matriz[matriz[0].length-i-1][matriz[0].length-j-1]; 
                matriz[matriz[0].length-i-1][matriz[0].length-j-1] = aux;

            }

        }

    }

    //Ejercicio 4

    public void concatarreglo(int[] arreglo1, int[] arreglo2, int[] arreglo3){

        int j = 0;

        for (int i = 0; i <= arreglo1.length*2-1; i++){

            if(i<=arreglo1.length-1){

                arreglo3[i] = arreglo1[i];

            }

            else{

                arreglo3[i] = arreglo2[j];
                j++;

            }

        }

    }

    public void bubbleSort(int[] arreglo){

        for(int i = 0; i < arreglo.length-1; i++){

            for(int j = 0; j < arreglo.length-i-1; j++){

                if (arreglo[j] > arreglo[j+1]){

                    int temp = arreglo[j];

                    arreglo[j] = arreglo[j+1];

                    arreglo[j+1] = temp;

                }

            }

        }

    }

    //Ejercicio 5

    public void setRandom(int[] arreglo){

        for(int i = 0; i<arreglo.length; i++){

            arreglo[i]=(int)(Math.random()*1000)+1;

        }

    }

    public void quickSortReturnAscendente(int[] arreglo){

        quickSortAscendente(arreglo, 0, arreglo.length-1);

    }

    public void quickSortReturnDescendente(int[] arreglo){

        quickSortDescendente(arreglo, 0, arreglo.length-1);

    }

    private void quickSortAscendente(int[] arreglo ,int izq, int der){
        
        int pivote = arreglo[izq]; //se consigue un número utilizado para comparar
        int i = izq; //posición 0 primero
        int j = der; //posición array.length - 1 primero
        int aux; //variable auxiliar para realizar los intercambios
        
        while(i<j){ //El bucle se ejecutará siempre y cuando el iterador izquierdo no choque con el derecho
            while (arreglo[i]<=pivote && i<j){

                i++;

            }
            while (arreglo[j]>pivote){

                j--;

            }
            if(i<j){

                aux = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = aux;

            }
        }

        arreglo[izq] = arreglo[j];
        arreglo[j] = pivote;

        if(izq < j-1){

            quickSortAscendente(arreglo, izq, j-1);

        }

        if(j+1 < der){

            quickSortAscendente(arreglo, j+1, der);

        }

    }

    private void quickSortDescendente(int[] arreglo,int izq, int der){
        
        int pivote = arreglo[izq]; //se consigue un número utilizado para comparar
        int i = izq; //posición 0 primero
        int j = der; //posición array.length - 1 primero
        int aux; //variable auxiliar para realizar los intercambios
        
        while(i<j){ //El bucle se ejecutará siempre y cuando el iterador izquierdo no choque con el derecho
            while (arreglo[i]>=pivote && i<j){

                i++;

            }

            while (arreglo[j]<pivote){

                j--;

            }

            if(i<j){

                aux = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = aux;

            }

        }

        arreglo[izq] = arreglo[j];
        arreglo[j] = pivote;

        if(izq < j-1){

            quickSortDescendente(arreglo, izq, j-1);

        }

        if(j+1 < der){

            quickSortDescendente(arreglo, j+1, der);

        }

    }

    //Ejercicio 6

    public void sumaMatrices(int[][] matriz1, int[][] matriz2){

        for(int i = 0; i< matriz1[0].length; i++){

            for (int j=0; j < matriz1[0].length; j++){

                matriz1[i][j]+=matriz2[i][j];

            }

        }

    }
}