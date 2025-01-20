
import java.util.Scanner;

public class Harmonik_Sayi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Input a number");
        double n = scn.nextInt();
        double z = 0;
        for(double i=1; i<=n; i++){
            z+= (1 / i);

            System.out.println(z);
        }
    }
}
