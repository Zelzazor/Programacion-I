package array.bubble_sort;

class ArregloOrdenadoBS{

    //Propiedades

    private int[] nums1 = new int[4];
    private int[] nums2 = new int[4];
    private int[] numsConcat = new int[8];

    //Getters & Setters

    public void setNums1(int pos, int num){

        nums1[pos] = num;

    }

    public void setNums2(int pos, int num){

        nums2[pos] = num;

    }

    //Métodos

    public void concatNums(){

        int j = 0;

        for (int i = 0; i <= nums1.length*2-1; i++){

            if(i<=nums1.length-1){

                numsConcat[i] = nums1[i];

            }

            else{

                numsConcat[i] = nums2[j];
                j++;

            }

        }

    }

    public String getDatosNums1(){

        String DataNums1 = "";

        for(int i = 0; i < nums1.length;i++){
            
            if (i==(nums1.length-2)){

                DataNums1+= nums1[i]+" y "; 

            }
            
            else if (i < nums1.length-2){

            DataNums1+= nums1[i] + ", ";

            }

            else{

                DataNums1+=nums1[i] + ".";

            }

        }

        return DataNums1;

    }

    public String getDatosNums2(){

        String DataNums2 = "";

        for(int i = 0; i < nums2.length;i++){
            
            if (i==(nums2.length-2)){

                DataNums2+= nums2[i]+" y "; 

            }
            
            else if (i < nums2.length-2){

                DataNums2+= nums2[i] + ", ";

            }

            else{

                DataNums2+=nums2[i] + ".";

            }

        }

        return DataNums2;

    }

    public String getDatosNumsConcat(){

        String DataNumsConcat = "";

        for(int i = 0; i < numsConcat.length;i++){
            
            if (i==(numsConcat.length-2)){

                DataNumsConcat+= numsConcat[i]+" y "; 

            }
            
            else if (i < numsConcat.length-2){

            DataNumsConcat+= numsConcat[i] + ", ";

            }
            else{

                DataNumsConcat+=numsConcat[i] + ".";

            }

        }

        return DataNumsConcat;

    }

    public void bubbleSort(){

        for(int i = 0; i < numsConcat.length-1; i++){

            for(int j = 0; j < numsConcat.length-i-1; j++){

                if (numsConcat[j] > numsConcat[j+1]){

                    int temp = numsConcat[j];

                    numsConcat[j] = numsConcat[j+1];

                    numsConcat[j+1] = temp;

                }

            }

        }

    }
    
}