public class AsalSayi {
    public static void main(String[] args) {
        for(int i = 2; i <= 100; i++){
            boolean asal = true;
             for(int j = 2; j<=i/2; j++){
                 /* i/2 yaptım çünkü zaten bir sayının 2 katı olanlar otomatik olarak asal değil, i'yi j ye böleceğim
                 * kareköklerine bakıyorum */
                if(i % j == 0){
                    asal = false;
                    break;
                }

            }
             if(asal){
                 System.out.println(i);
             }
        }
    }
}
