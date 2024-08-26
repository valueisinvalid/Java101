import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy = input.nextDouble();
        int kilo = input.nextInt();
        double BMI = kilo/(boy*boy);

        System.out.println(BMI);

    }
}
