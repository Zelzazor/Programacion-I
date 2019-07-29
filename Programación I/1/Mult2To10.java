class Mult2To10 {
    public static void main(String[] args) {
        System.out.println("Tablas de Multiplicar del 2 al 10"); 
        
        for (int i = 2; i <= 10; i++){
            System.out.println("Tabla del "+ i+"\n");
            for(int j = 1; j <= 10; j++){
                System.out.println(i +" * "+j+" = "+i*j);
            }
        }
    }
}