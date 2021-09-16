package mainpackage;

public class Client extends Users {
long afm;
long phonenumber;




public void Bill(){
	System.out.println("You can see your bill below." + "You owe 30 euros.");
	}

public void PreviousBill(){
	System.out.println("You can see all your previous bills here." 
+ "You paid 27 euros last month." 
+ "You paid 25 euros in February."
+ "You paid 29 euros in January.");	
	}


public void PayBill() {
	
	System.out.println("You have successfully paid 30 euros.");
}

}
