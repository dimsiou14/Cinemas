package mainpackage;

public class CreateUsers {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Admin user1 = new Admin();
		Client user2 = new Client();
		Seller user3 = new Seller();
		
		user1.AddUser();
		user2.PayBill();
		user3.ChangeProgram();
		
		
	}

}
