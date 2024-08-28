import java.util.Scanner;
public class yildizucgen {
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
    }
}
