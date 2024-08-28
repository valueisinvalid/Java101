import java.util.Scanner;
public class Faktoriyel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int result= 1;
        System.out.print(a+"!= ");
        for(int i =a; i>1; i--){
            result *= i;

        }
        System.out.print(result);
    }
}
