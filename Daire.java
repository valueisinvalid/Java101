import java.util.Scanner;

public class Daire {
    //dairenin alanını ve çevresini hesaplayan program

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int pi = 3;
        int area = r*r*pi;
        int perimeter = r*pi*2;

        System.out.println(area);
        System.out.println(perimeter);
    }
}
