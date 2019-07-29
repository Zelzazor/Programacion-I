class Sum1To20 {
    public static void main(String[] args) {
        System.out.println("Sumatoria del 1 al 20."); 
        int result = 0;
        for (int i = 1; i <= 20; i++){
            result+=i;
        }
        System.out.println(result);
    }
}