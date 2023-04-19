import java.util.Scanner;

public class Transaction {

    static void withdraw(){
    	Scanner scan=new Scanner(System.in);
        System.out.println("*************");
        System.out.println("Enter amount to withdraw :");
        int cash=scan.nextInt();
        if(cash<=ATMClass.balance){
            ATMClass.balance=ATMClass.balance-cash;
            ATMClass.history.add(Integer.toString(cash));
            ATMClass.history.add("Withdraw");
            System.out.println("Amount Rs"+cash+"/-withdraw successfully");
            System.out.println("*************");
        }
        else{
            System.out.println("insufficient balance to withdraw");
            System.out.println("*************");
        }
        ATMClass.prompt();
    }
    static void deposit(){
    	Scanner scan=new Scanner(System.in);
    	 System.out.println("*************");
        System.out.print("Enter amount to deposit :");
        int dcash=scan.nextInt();
        ATMClass.updatebalance(dcash);
        ATMClass.history.add(Integer.toString(dcash));
        ATMClass.history.add("Deposit");
        System.out.println("Amount Rs."+dcash+"/- deposit successful!");
        System.out.println("*************");
        ATMClass.prompt();
    }
    static void transfer(){
    	Scanner scan=new Scanner(System.in);
        System.out.println("Enter the beneficiary name:");
        String s=scan.nextLine();
        System.out.println("Enter the account number of the beneficiary");
        int num=scan.nextInt();
        System.out.println("Enter the amount to be transferred :");
        int tcash=scan.nextInt();
        if(tcash<=ATMClass.balance){
        	ATMClass.balance=ATMClass.balance-tcash;
        	ATMClass.history.add(Integer.toString(tcash));
        	ATMClass.history.add("transferred");
            System.out.println("Amount Rs."+tcash+"/- transferred successfully");
            System.out.println("*************");
        }
        else{
            System.out.println("insufficient balance to transfer the cash");
            System.out.println("*************");
        }
    }

}
