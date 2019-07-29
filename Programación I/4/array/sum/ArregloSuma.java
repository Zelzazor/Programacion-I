package array.sum;

class ArregloSuma {

    //Propiedades

    private int[] suma = new int[5];

    //Getters & Setters

    public void setSuma(int pos, int num){

        suma[pos] = num;

    }

    //Métodos

    public int SumaArreglo(){

        int sumaInt = 0;

        for (int i = 0; i<suma.length;i++){

            sumaInt+=suma[i];

        }

        return sumaInt;

    }

    public String getDatosSuma(){

        String DataSuma = "";

        for(int i = 0; i < suma.length;i++){
            
            if (i==(suma.length-2)){

                DataSuma+= suma[i]+" y "; 

            }
            
            else if (i < suma.length-2){

            DataSuma+= suma[i] + ", ";

            }

            else{

                DataSuma+=suma[i] + ".";
            }
            
        }

        return DataSuma;
    }

}