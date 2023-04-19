public class Check {
    static void checkbalance(){
		System.out.println("*************");
		System.out.println("The available balance in your bank account is :");
		ATMClass.showbalance();
		System.out.println("*************");
		ATMClass.prompt();
    }

}
