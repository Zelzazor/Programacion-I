class SumOddNums1To1000 {
    public static void main(String[] args) {
        System.out.println("N\u00FAmeros impares del 1 al 1000.");
        int result = 0;
        for (int i = 1; i <= 1000; i=i+2){
         result+=i;
        }
        System.out.println(result);
    }
}