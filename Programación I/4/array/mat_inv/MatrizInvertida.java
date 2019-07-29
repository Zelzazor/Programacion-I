package array.mat_inv;

class MatrizInvertida{

    //Propiedades

    int[][] nums = new int[2][2];
    int[][] inverso = new int [2][2];


    //Getters & Setters

    public void setNums(int pos1, int pos2, int num){

        nums[pos1][pos2] = num;

    }

    public void getNums(int pos1, int pos2){

        return num[pos1][pos2];
        
    }

    //Métodos

    public void InversoMatriz(){

        for (int i = 0; i < nums.length; i++){

            for(int j = 0; j < nums[0].length; j++){

                inverso[i][j] = nums[nums[0].length-i-1][nums[0].length-j-1]; 

            }

        }

    }
    

    public String getDatosNums(){

        String DataNums = "";

        for (int i = 0; i < nums[0].length; i++){

            for (int j=0; j < nums[0].length; j++){

                DataNums+=nums[i][j]+" ";

            }

            DataNums+="\n";

        }

        return DataNums;

    }

    public String getDatosInverso(){

        String DataNums = "";

        for (int i = 0; i < inverso[0].length; i++){

            for (int j=0; j < inverso[0].length; j++){

                DataNums+=inverso[i][j]+" ";

            }

            DataNums+="\n";

        }

        return DataNums;

    }
    
}