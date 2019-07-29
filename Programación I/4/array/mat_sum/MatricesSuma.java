package array.mat_sum;

class MatricesSuma{

    //Propiedades

    private int[][] nums1 = new int[3][3];
    private int[][] nums2 = new int[3][3];

    //Getters y Setters

    public void setNums1(int pos1, int pos2, int num){

        nums1[pos1][pos2] = num;

    }

    public void setNums2(int pos1, int pos2, int num){

        nums2[pos1][pos2] = num;
        
    }

    //Métodos

    public String getDatosNums1(){

        String DataNums = "";

        for (int i = 0; i < nums1[0].length; i++){

            for (int j=0; j < nums1[0].length; j++){

                DataNums+=nums1[i][j]+" ";

            }

            DataNums+="\n";

        }

        return DataNums;

    }

    public String getDatosNums2(){

        String DataNums = "";

        for (int i = 0; i < nums2[0].length; i++){

            for (int j=0; j < nums2[0].length; j++){

                DataNums+=nums2[i][j]+" ";

            }

            DataNums+="\n";

        }

        return DataNums;

    }

    public void sumaMatrices(){

        for(int i = 0; i< nums1[0].length; i++){

            for (int j=0; j < nums1[0].length; j++){

                nums1[i][j]+=nums2[i][j];

            }

        }

    }

}