import java.util.ArrayList;
import java.util.Scanner;

public class ATMClass {
    public static String name;
    public static int balance=0;
    public static String accountnumber;
    public static ArrayList<String> history=new ArrayList<String>();

    static void updatebalance(int dcash){
        balance=balance+dcash;
    }
    static void showbalance(){
        System.out.println(balance);
    }
    public static void homepage(){
        System.out.println("******************");
        Scanner scan=new Scanner(System.in);
        System.out.println("***WELCOME TO ATM **");
        System.out.println("******************");
        System.out.println("Select Option :");
        System.out.println("1.Register");
        System.out.println("2.Exit");
        System.out.println("Enter your choice");
        int choice =scan.nextInt();
        if (choice==1){
            Account.register();
        }
        else {
            if(choice==2){
                System.exit(0);
            }
            else{
                System.out.println("select any option from the below :");
                homepage();
            }
        }
    }
    static void prompt(){
    	Scanner scan=new Scanner(System.in);
        System.out.println("** WELCOME "+ATMClass.name+"**");
        System.out.println("---------------------");
        System.out.println("Select Option : ");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Transfer");
        System.out.println("4. Check Balance");
        System.out.println("5. Transaction History");
        System.out.println("6. Exit");
        System.out.print("Enter your choice : ");
        int choice=scan.nextInt();
        switch (choice) {
            case 1:
                Transaction.withdraw();
            case 2:
            	Transaction.deposit();
            case 3:
            	Transaction.transfer();
            case 4:
                Check.checkbalance();
            case 5:
                History.transactionhistory();
            case 6:
                System.exit(0);
        }
    }

    public static void main(String[] args) {
        homepage();
    }


}
