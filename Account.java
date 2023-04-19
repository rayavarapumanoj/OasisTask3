import java.util.ArrayList;
import java.util.Scanner;
public class Account {
// Account info of ATM
    static  void register(){
    	Scanner scan =new Scanner(System.in);
        System.out.println("Enter your name :");
        ATMClass.name=scan.nextLine();
        System.out.println("Enter username :");
        String user=scan.nextLine();
        System.out.println("Enter password :");
        String pass=scan.nextLine();
        System.out.println("Enter the Account number :");
        ATMClass.accountnumber=scan.nextLine();
        System.out.println("REGISTRATION SUCCESSFULL");
        System.out.println("*************************");
        ATMClass.prompt();
        while(true){
            display(ATMClass.name);
            int choice=scan.nextInt();
            if(choice==1){
                login(user,pass);
                break;
            }
            else {
                if(choice==2){
                    System.exit(0);
                }
                else{
                    System.out.println("Invalid Input! Try  again!");
                }
            }
        }
    }
    static void display(String name){}
    static void login(String user,String pass){}
}

