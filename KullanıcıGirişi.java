import java.util.Scanner;
public class KullanıcıGirişi {
    public static void main(String[] args) {
        String username,password;

        Scanner input = new Scanner(System.in);

        username = input.nextLine();
        password = input.nextLine();

        if(username.equals("patika") && password.equals("dev")){
            System.out.println("Kullanıcı girişi yapıldı.");
        } else{
            System.out.println("Giriş yapılamadı.");
        }


    }
}
