package array.random_quick_sort;

class ArregloOrdenadoQSTest{
    public static void main(String[] args) {
        ArregloOrdenadoQS qs = new ArregloOrdenadoQS();
        System.out.println("El arreglo generado es:\n"+qs.getDatosNums());
        qs.quickSortReturnAscendente();
        System.out.println("El arreglo ordenado de forma ascendente es:\n"+qs.getDatosNums());
        qs.quickSortReturnDescendente();
        System.out.println("El arreglo ordenado de forma descendente es:\n"+qs.getDatosNums());
    }
}