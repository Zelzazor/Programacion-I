class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Serie de Fibonacci."); 
        int S1 = 1, S2 = 1, S3;
        
        for (int i = 1; i <= 10; i++){
            System.out.println(S1);
            S3 = S1 + S2;
            S1 = S2;
            S2 = S3;
        }
    }
}