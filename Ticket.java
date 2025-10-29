// Ticket Booking System.
// Login
// Exit 

// Login → mobile number 
// 1.1 	Book Ticket { Gold Silver Diamond -Qty } 
// 1.2	View Booked Tickets
// 1.3	Available Tickets 
// 1.4       Logout

// Three Types of Ticket , Diamond - Rs.200 , Gold - Rs.150 , Silver -Rs.100 	

// One user can book max 7 Tickets.
// Total 60 tickets we have 20 Diamond , 20 Gold and 20 Silver.
// User can identified by mobile number.

import java.util.*;
class Ticket {
    String type;
    int price;
    int quantity;

    public Ticket(String type, int price, int quantity) {
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }
}

class User{
    String mobileNumber;
    int bookedTickets;

    public User(String mobileNumber, int bookedTickets){
        this.mobileNumber = mobileNumber;
        this.bookedTickets = bookedTickets;
    }

    public void ticketBook(Ticket ticket){
        if(bookedTickets > 7){
            System.out.println("Cannot book more then 7 tickets by one user!!");
            break;
        }

    }
}