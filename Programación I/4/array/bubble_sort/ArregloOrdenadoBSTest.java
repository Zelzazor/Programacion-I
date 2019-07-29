package array.bubble_sort;

class ArregloOrdenadoBSTest{
    public static void main(String[] args) {
        ArregloOrdenadoBS bs = new ArregloOrdenadoBS();
        bs.setNums1(0, 34);
        bs.setNums1(1, 45);
        bs.setNums1(2, 65);
        bs.setNums1(3, 29);
        bs.setNums2(0, 54);
        bs.setNums2(1, 98);
        bs.setNums2(2, 85);
        bs.setNums2(3, 78);
        bs.concatNums();
        System.out.println("El primer arreglo es: "+bs.getDatosNums1());
        System.out.println("El segundo arreglo es: "+bs.getDatosNums2());
        System.out.println("La combinacion de ambos arreglos es: "+bs.getDatosNumsConcat());
        bs.bubbleSort();
        System.out.println("El arreglo ordenado es: "+bs.getDatosNumsConcat());
    }
}