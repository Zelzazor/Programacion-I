package array.inv;

class ArregloInverso{
    
    //Propiedades

    private int[] nums = new int[5];
    private int[] inverso = new int[5];
    
    //Getters & Setters

    public void setNums(int pos, int num){

        nums[pos] = num;

    }

    //Métodos

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

    public void InversoArreglo(){

        for (int i = 0; i < nums.length; i++){

            inverso[i] = nums[nums.length-i-1];

        }

    }

    public String getDatosInverso(){
        
        String DataInverso = "";

        for(int i = 0; i < inverso.length;i++){
            
            if (i==(inverso.length-2)){

                DataInverso+= inverso[i]+" y "; 

            }
            
            else if (i < inverso.length-2){

            DataInverso+= inverso[i] + ", ";

            }

            else{

                DataInverso+=inverso[i] + ".";

            }

        }

        return DataInverso;
        
    }

}