
public class History {

	static void transactionhistory() {
		System.out.println("---------------------");
		System.out.println("Transaction History :");
		int k = 0;
		if (ATMClass.balance > 0) {
			for (int i = 0; i < (ATMClass.history.size() / 2); i++) {
				for (int j = 0; j < 2; j++) {
					System.out.print(ATMClass.history.get(k) + " ");
					k++;
				}
				System.out.println("---------------------");
			}
		} else {
			System.out.println("your account has no sufficient balance");
		}
		ATMClass.prompt();
	}

}
