package array.inv;

class ArregloInversoTest {
    public static void main(String[] args) {
        ArregloInverso inv = new ArregloInverso();
        inv.setNums(0, 43);
        inv.setNums(1, 98);
        inv.setNums(2, 27);
        inv.setNums(3, 67);
        inv.setNums(4, 14);
        inv.InversoArreglo();
        System.out.println("El arreglo es: "+inv.getDatosNums());
        System.out.println("El arreglo inverso es: "+inv.getDatosInverso());
    }
}