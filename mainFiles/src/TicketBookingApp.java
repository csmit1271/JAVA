
public class TicketBookingApp {

	public static void main(String[] args) {

		 
			
		
	}
}

//Ticket Booking System.
//
//Login
//Exit 
//
//Login → mobile number 
//
//1.1 	Book Ticket { Gold Silver Diamond -Qty } 
//1.2	View Booked Tickets
//1.3	Available Tickets 
//1.4       Logout
//
//Three Types of Ticket , Diamond - Rs.200 , Gold - Rs.150 , Silver -Rs.100 	
//One user can book max 7 Tickets.
//Total 60 tickets we have 20 Diamond , 20 Gold and 20 Silver.
//User can identified by mobile number. 

//cohesive -> 
//coupling -> 
//
class Ticket {

	private int totalDiamond;
	private int totalSilver;
	private int totalGold;

	private  final int DIAMOND_PRICE;
	private  final int GOLD_PRICE;
	private  final int SILVER_PRICE;

	private static final int TOTAL_ALLOWED_TICKETS = 7;

	 
 
	Ticket(int gold_PRICE, int diamond_PRICE) {
		this.totalDiamond = 20;
		this.totalGold = 20;
		this.totalSilver = 20;
		this.DIAMOND_PRICE = diamond_PRICE;
		this.GOLD_PRICE = gold_PRICE;
		this.SILVER_PRICE = 0;
	}

	public int getTotalDiamond() {
		return totalDiamond;
	}

	public void setTotalDiamond(int totalDiamond) {
		this.totalDiamond = totalDiamond;
	}

	public int getTotalSilver() {
		return totalSilver;
	}

	public void setTotalSilver(int totalSilver) {
		this.totalSilver = totalSilver;
	}

	public int getTotalGold() {
		return totalGold;
	}

	public void setTotalGold(int totalGold) {
		this.totalGold = totalGold;
	}

	public   int getDiamondPrice() {
		return DIAMOND_PRICE;
	}

	public   int getGoldPrice() {
		return GOLD_PRICE;
	}

	public   int getSilverPrice() {
		return SILVER_PRICE;
	}

	public   int getTotalAllowedTickets() {
		return TOTAL_ALLOWED_TICKETS;
	}

}

class UserTicket {
	private String mobileNumer;

	private int userDiamond;
	private int userSilver;
	private int userGold;

	public String getMobileNumer() {
		return mobileNumer;
	}

	public void setMobileNumer(String mobileNumer) {
		this.mobileNumer = mobileNumer;
	}

	public int getUserDiamond() {
		return userDiamond;
	}

	public void setUserDiamond(int userDiamond) {
		this.userDiamond = userDiamond;
	}

	public int getUserSilver() {
		return userSilver;
	}

	public void setUserSilver(int userSilver) {
		this.userSilver = userSilver;
	}

	public int getUserGold() {
		return userGold;
	}

	public void setUserGold(int userGold) {
		this.userGold = userGold;
	}

}
