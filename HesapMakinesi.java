import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sayıları giriniz:");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("Yapmak istediğiniz işlem 1 toplama 2 çıkarma 3 bölme 4 çarpma");
        int c = input.nextInt();

        switch(c){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a/b);
                break;
            case 4:
                System.out.println(a*b);
                break;
            default:
                System.out.println(0);
                break;

        }
    }
}
