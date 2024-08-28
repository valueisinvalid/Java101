import java.util.Scanner;

public class MaxMinBuldurma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç sayı gireceksiniz: ");
        int sayı = input.nextInt();


        if (sayı <= 0) {
            System.out.println("Geçersiz sayı.");
            return;
        }

        System.out.print("1. sayıyı giriniz: ");
        int a = input.nextInt();
        int maxNum = a;
        int minNum = a;

        for (int i = 2; i <= sayı; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int b = input.nextInt();

            if (b > maxNum) {
                maxNum = b;
            }

            if (b < minNum) {
                minNum = b;
            }
        }

        System.out.println("Max number is " + maxNum);
        System.out.println("Min number is " + minNum);
    }
}
