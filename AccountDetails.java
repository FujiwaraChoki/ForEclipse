import java.util.Scanner;

public class AccountDetails {
	String[] username = {"sami", "yanik", "nikita", "fadia"};
	String[] password = {"hindi", "perez", "kochkarov", "poki"};
	
	static Scanner scanner;
	
	public AccountDetails() {
		
	}
	
	public AccountDetails(String[] username, String[] password) {
		this.username = username;
		this.password = password;
	}
	
	public boolean checkUsername(String usernameForUser) { // Check Username
			return getUsernameIndex(usernameForUser) != -1;
		 // helloworld.getUsernameForUser()
}
	
	
	public boolean checkPassword(String usernameForUser, String passwordForUser) { // Check Password
				scanner = new Scanner(System.in);
				if(passwordForUser.equals(password[getUsernameIndex(usernameForUser)])) {
					System.out.println("Wilkommen zu der Software");
					auswahlMethode();
					return true;
			}
		return false;
	}
    private int getUsernameIndex(String usernameForUser) { // Check Username
        for(int i = 0; i < username.length; i++) {
            if(usernameForUser.equals(username[i])) {
                return i;
	        } // helloworld.getUsernameForUser()
	    }
	    return -1;
    }
    public static char auswahlMethode() {
		System.out.println("Supermarkt (S), Bankmanager (B), Exit (E)");
		char auswahl = scanner.nextLine().charAt(0);
		if(auswahl == 'S') {
			MainCode.supermarkt();
		} else if(auswahl == 'B') {
			MainCode.bankManager();
		}
		else if(auswahl == 'E') {
			System.exit(auswahl);
		}
		return auswahl;
    }
}
