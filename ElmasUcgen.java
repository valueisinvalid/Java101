import java.util.Scanner;

public class ElmasUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
     *
    ***
   *****
  *******
 *********
***********

         */
int row= input.nextInt();
        for(int i =0; i<row; i++){

            for(int n=row-i; n>1; n--){
                System.out.print(" ");
            }

            for(int n=0; n<=i*2; n++){
                System.out.print("*");
            }


            System.out.println();
        }

        // row -2 because we don't need to repeat the middle line
        // i only changed how i gets bigger or lower, didn't need to touch others
        for (int i = row - 2; i >= 0; i--) {
            // Print leading spaces
            for (int j = row - i; j > 1; j--) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
