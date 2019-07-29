package array.sum;

class ArregloSumaTest{
    public static void main(String[] args) {
        ArregloSuma s = new ArregloSuma();
        s.setSuma(0, 14);
        s.setSuma(1, 65);
        s.setSuma(2, 54);
        s.setSuma(3, 53);
        s.setSuma(4, 12);
        System.out.println("Los números introducidos son: "+s.getDatosSuma());
        System.out.println("El resultado es: "+s.SumaArreglo());
        
        
    }
}