package array.mat_sum;

class MatricesSumaTest{
    public static void main(String[] args) {
        MatricesSuma s = new MatricesSuma();
        /*--------nums1-------------*/
        s.setNums1(0, 0, 54);
        s.setNums1(0, 1, 65);
        s.setNums1(0, 2, 2);
        s.setNums1(1, 0, 58);
        s.setNums1(1, 1, 45);
        s.setNums1(1, 2, 38);
        s.setNums1(2, 0, 3);
        s.setNums1(2, 1, 95);
        s.setNums1(2, 2, 18);
        /*--------nums2-------------*/
        s.setNums2(0, 0, 84);
        s.setNums2(0, 1, 5);
        s.setNums2(0, 2, 2);
        s.setNums2(1, 0, 74);
        s.setNums2(1, 1, 98);
        s.setNums2(1, 2, 23);
        s.setNums2(2, 0, 71);
        s.setNums2(2, 1, 49);
        s.setNums2(2, 2, 93);

        /*----------Obtener los datos---------*/

        System.out.println("La primera matriz es:\n"+s.getDatosNums1()+"\n");
        System.out.println("La segunda matriz es:\n"+s.getDatosNums2()+"\n");
        s.sumaMatrices();
        System.out.println("La matriz suma es:\n"+s.getDatosNums1());
    }
}