/**
 * 
 */

/**
 * @author Sami
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class MainCode {

	private String usernameForUser;
	private String passwordForUser;

    static Scanner scanner;

    public MainCode() {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
    	MainCode program = new MainCode();
        program.run();
        // Zerstört das Objekt, in diesem Fall Scanner, ist die saubere Version sollte man lassen
        scanner.close();
    }

    private void run() {
        // TODO: realize the program logic
    	AccountDetails accountDetails = new AccountDetails();

        	if(!(accountDetails.checkUsername(inputUsernameForUser()))) {
    			System.out.println("Username doesn't exist");
        	} else if(!(accountDetails.checkPassword(usernameForUser, inputPasswordForUser()))) {
        		System.out.println("Incorrect Password");
        	} 
    }

	public String inputUsernameForUser() { // Input the Username
    	System.out.println("Username");
    	usernameForUser = scanner.nextLine();
    	return usernameForUser;
    }
    
    public String inputPasswordForUser() { // Input the Password
    	System.out.println("Password");
    	passwordForUser = scanner.nextLine();
    	return passwordForUser;
    }
    
    public void setUsernameForUser(String usernameForUser) { // Setter Username
    	this.usernameForUser = usernameForUser;
    }
    
    public String getUsernameForUser() { // Getter Username
    	return usernameForUser;
    }

    public void setPasswordForUser(String PasswordForUser) { // Setter Password
    	this.passwordForUser = passwordForUser;
    }
    
    public String getPasswordForUser() { // Getter Password
    	return passwordForUser;
    }
    
    
    
    // This is the Program Code
    public static void supermarkt() {
    	System.out.println("Wie viel Geld haben Sie in Ihrem Konto");
    	double geldImKonto = Double.parseDouble(scanner.nextLine());
    	boolean solangeKaufen = true;
    	while(geldImKonto > 0 && solangeKaufen == true) {
    		System.out.println("Was moechten Sie kaufen?");
    		String produkt = scanner.nextLine();
    		
    		System.out.println("Wie viel kostet "+produkt+" ?");
    		double produktPreis = Double.parseDouble(scanner.nextLine());
    		
    		System.out.println("Sie haben "+produkt+" gekauft, und es hat "+produktPreis+" gekostet");
    		System.out.println("Wollen Sie noch ein Produkt kaufen?");
    		String willKaufen = scanner.nextLine();
    		
    		if(willKaufen.equals("Nein")) {
    			solangeKaufen = false;
    		}
    		AccountDetails.auswahlMethode();
    	}
    }
    public static void bankManager() {
    	System.out.println("Geld im Bank Konto > ");
    	double geldInBank = Double.parseDouble(scanner.nextLine());
    	
    	boolean willAktionBool = true;
    	
    	while(willAktionBool == true) {
    		System.out.println("Wollen Sie eine Aktion machen (J/N)");
    		char optionAktion = scanner.nextLine().charAt(0);
    		if(optionAktion == 'J') {
    			System.out.println("Geld versenden (1), Geld fordern (2), Bankkonto schliessen (3)");
    			char welcheOption = scanner.nextLine().charAt(0);
    			if(welcheOption == '1') {
    				System.out.println("An wen das Geld senden?");
    				String anWen = scanner.nextLine();
    				
    				System.out.println("Wie viel Geld versenden?");
    				double wieVielGeldVersenden = Double.parseDouble(scanner.nextLine());
    				
    				System.out.println("Sie haben an "+anWen+", CHF "+wieVielGeldVersenden+" versandt!");
    			} else if(welcheOption == '2') {
    				System.out.println("Von wem verlangen Sie Geld?");
    				String vonWem = scanner.nextLine();
    				
    				System.out.println("Wie viel Geld versenden?");
    				double wieVielGeldVerlangt = Double.parseDouble(scanner.nextLine());
    				
    				System.out.println("Sie haben von "+vonWem+", CHF "+wieVielGeldVerlangt+" verlangt!");
    			} else if(welcheOption == '3') {
    				System.out.println("Hiermit wurde Ihr Bank Account geschlossen, bitte lassen Sie ein Feedback zurueck!");
    			}
    			AccountDetails.auswahlMethode();
    			
    		} else if(optionAktion == 'N') {
    			willAktionBool = false;
    		}
    	}
    }
}

}
