package array.random_quick_sort;

class ArregloOrdenadoQS{

    //Propiedades

    private int[] nums = new int[10];


    //Constructor
    
    public ArregloOrdenadoQS(){

        super();
        setNumsRandom();

    }

    //Métodos

    public void setNumsRandom(){

        for(int i = 0; i<nums.length; i++){

            nums[i]=(int)(Math.random()*1000)+1;

        }

    }

    public String getDatosNums(){

        String DataNums = "";

        for(int i = 0; i < nums.length;i++){
            
            if (i==(nums.length-2)){

                DataNums+= nums[i]+" y ";

            }
            
            else if (i < nums.length-2){

                DataNums+= nums[i] + ", ";

            }

            else{

                DataNums+=nums[i] + ".";

            }
        }

        return DataNums;

    }

    public void quickSortReturnAscendente(){

        quickSortAscendente(0, nums.length-1);

    }

    public void quickSortReturnDescendente(){

        quickSortDescendente(0, nums.length-1);

    }

    private void quickSortAscendente(int izq, int der){
        
        int pivote = nums[izq]; //se consigue un número utilizado para comparar
        int i = izq; //posición 0 primero
        int j = der; //posición array.length - 1 primero
        int aux; //variable auxiliar para realizar los intercambios
        
        while(i<j){ //El bucle se ejecutará siempre y cuando el iterador izquierdo no choque con el derecho
            while (nums[i]<=pivote && i<j){

                i++;

            }
            while (nums[j]>pivote){

                j--;

            }
            if(i<j){

                aux = nums[i];
                nums[i] = nums[j];
                nums[j] = aux;

            }
        }

        nums[izq] = nums[j];
        nums[j] = pivote;

        if(izq < j-1){

            quickSortAscendente(izq,j-1);

        }

        if(j+1 < der){

            quickSortAscendente(j+1,der);

        }

    }

    private void quickSortDescendente(int izq, int der){
        
        int pivote = nums[izq]; //se consigue un número utilizado para comparar
        int i = izq; //posición 0 primero
        int j = der; //posición array.length - 1 primero
        int aux; //variable auxiliar para realizar los intercambios
        
        while(i<j){ //El bucle se ejecutará siempre y cuando el iterador izquierdo no choque con el derecho
            while (nums[i]>=pivote && i<j){

                i++;

            }

            while (nums[j]<pivote){

                j--;

            }

            if(i<j){

                aux = nums[i];
                nums[i] = nums[j];
                nums[j] = aux;

            }

        }

        nums[izq] = nums[j];
        nums[j] = pivote;

        if(izq < j-1){

            quickSortDescendente(izq,j-1);

        }

        if(j+1 < der){

            quickSortDescendente(j+1,der);

        }

    }

}