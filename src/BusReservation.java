// Declared the class bus reservation
public class BusReservation implements Runnable{
	private int totalSeatsAvailable=25;
	
	public void run() {
		// Initializing the current thread 
		PassengerThread pt = (PassengerThread)Thread.currentThread();
		// tickets check the booked tickets
		boolean ticketsBooked = this.bookTickets(pt.getSeatsNeeded(), pt.getName());
		// validate whether the tickets booked are not
		if(ticketsBooked==true){
			// Display Tickets booked message if tickets booking successful
				System.out.println("CONGRATS Mr."+Thread.currentThread().getName()+" ..The number of seats requested("+pt.getSeatsNeeded()+")  are BOOKED");
			}
		else{
			// Display below message if ticket booking failed
			System.out.println("Sorry Mr."+Thread.currentThread().getName()+" ..The number of seats requested("+pt.getSeatsNeeded()+")  are not available");
			}
		}
	// called synchronized method for booking tickets
	public synchronized boolean bookTickets(int seats, String name){
		// Welcome message to user and shows available tickets
		System.out.println("Welcome to HappyBus "+Thread.currentThread().getName()+" Number of Tickets Available are:"+this.getTotalSeatsAvailable());
		// check the required tickets greater than available tickets
		if (seats>this.getTotalSeatsAvailable()) {
		return false; // return false if condition passes
		} else 
		{
			totalSeatsAvailable = totalSeatsAvailable-seats; // reduce the booked tickets from avaiable seats
			return true; // return true
			}
		}
	// method to return available seats
	private int getTotalSeatsAvailable() {
	return totalSeatsAvailable;
	}

}