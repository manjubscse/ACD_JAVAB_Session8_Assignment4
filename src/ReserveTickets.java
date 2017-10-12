// Declare Class Reserve Tickets
public class ReserveTickets{

public static void main(String[] args){
	// initializing the class Bus Reservation
	BusReservation reserveBus = new BusReservation();
	// initialize the thread to book the tickets
	PassengerThread pt1 = new PassengerThread(2,reserveBus ,"RAMESH");
	// initialize the thread to book the tickets
	PassengerThread pt2 = new PassengerThread(3, reserveBus , "SATISH");
	pt1.start();	// Start the Thread
	pt2.start();	// Start the Thread
}
}