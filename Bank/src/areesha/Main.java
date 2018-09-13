
package areesha;

public class Main {

	public static void main(String[] args) {
		Bank bank1=new Bank("PNB");
		bank1.addBranch("Rakab Ganj");
		bank1.addCustomer("Rakab Ganj", "areeeesha", 100000.00);
		bank1.addCustomer("Rakab Ganj", "aru", 15000.00);
		bank1.addCustomer("Rakab Ganj", "arfasi", 10000.00);
		bank1.addCustomer("Rakab Ganj", "areesh", 20000.00);
		bank1.addCustTransaction("Rakab Ganj", "areesha", 34567);
		bank1.addBranch("Mahanagar");
		bank1.addCustomer("Mahanagar", "areesha", 150000.0);
		bank1.addCustTransaction("Rakab Ganj", "aru", 100000.00);
		bank1.addCustTransaction("Rakab Ganj", "arfasi", 500000.00);
		bank1.listCustomers("Rakab Ganj", true);
		bank1.listCustomers("Mahanagar", false);
		bank1.addCustTransaction("Hazrat Ganj", "areesha", 34567);
		bank1.addBranch("Mahanagar");
		bank1.addCustomer("Rakab Ganaj", "areesh", 29000.00);
	}

}
