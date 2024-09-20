import java.util.Scanner;
public class Tek_Cift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz");
        int i = input.nextInt();
        boolean tek = false;




        int n = 0;
        while (!tek) {


            if (i % 2 == 0) {
                n += i;
                System.out.println(i);
            }

            System.out.print("Sayı giriniz");
            i = input.nextInt();



            if (i % 2 != 0) {
                tek = true;
            }


        }
        System.out.println(n);



    }
}
