import java.util.Scanner;
public class Ebob_Ekok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        int n2 = input.nextInt();

        int ebob=1;
        int ekok=1;

       /* for(int i =1; i<= n1; i++){
            if(n1%i==0 && n2%i==0){
                ebob = i;
            }
        }

        System.out.println(ebob);

        //ekok
        for(int i =1; i<= (n1*n2); i++){
            if(i%n1==0 && i%n2==0){
                ekok = i;
                break;
            }

        }

        System.out.println(ekok);

        */

        //trying with a while loop

        int i=1;

        while(i<= n1){
            i++;
            if(n1%i==0 && n2%i==0){
                ebob = i;
            }
        }
        System.out.println(ebob);

        while(i<= (n1*n2)){
            i++;
            if(i%n1==0 && i%n2==0){
                ekok = i;
                break;
            }
        }
        System.out.println(ekok);


    }
}
