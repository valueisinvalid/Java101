import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Put in the km:");
        int km = input.nextInt();
        double fiyat = km * 2.20;

        double ucret = 10+ fiyat;

        if(ucret<20){
            ucret = 20;
        }

        System.out.println(ucret);
}
}
