package array.mat_inv;

class MatrizInvertidaTest{
    public static void main(String[] args) {
        MatrizInvertida m = new MatrizInvertida();
        m.setNums(0, 0, 42);
        m.setNums(0, 1, 53);
        m.setNums(1, 0, 73);
        m.setNums(1, 1, 23);
        m.InversoMatriz();
        System.out.println("La matriz es: \n"+m.getDatosNums());
        System.out.println("La matriz invertida es: \n"+m.getDatosInverso());
    }
}