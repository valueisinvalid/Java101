import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        double Armut = 2.14;
        double Elma = 3.67;
        double Domates = 1.11;
        double Muz = 0.95;
        double Patlıcan = 5.00;

        Scanner input = new Scanner(System.in);
        int kg1 = input.nextInt();
        int kg2 = input.nextInt();
        int kg3 = input.nextInt();
        int kg4 = input.nextInt();
        int kg5 = input.nextInt();

        System.out.println(Armut*kg1 + Elma * kg2 + Domates * kg3 + Muz*kg4 + Patlıcan*kg5);


    }

}
