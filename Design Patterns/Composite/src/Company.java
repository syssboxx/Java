
public class Company {

	//=Client
	public static void main(String[] args) {
		Engineer eng1 = new Engineer(100, "Peter", "Engineering");
        Engineer eng2 = new Engineer(101, "Martin", "Engineering");
        
        CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.addEmployee(eng1);
        engDirectory.addEmployee(eng2);
         
        Accountant acc1 = new Accountant(200, "Alex", "Accounts");
        Accountant acc2 = new Accountant(201, "Mary", "Accounts");
        
        CompanyDirectory accDirectory = new CompanyDirectory();
        accDirectory.addEmployee(acc1);
        accDirectory.addEmployee(acc2);
     
        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);
        directory.showEmployeeDetails();

	}
}
