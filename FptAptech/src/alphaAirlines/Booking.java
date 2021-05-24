package alphaAirlines;

public class Booking {
	String bookingId;
	String departureDate;
	int numberOfTickets;
	float price;
	String cabinType;
	float totalPrice;
	String destination;

	public Booking() {

	}
	
	public Booking(String bookingId,String departureDate,int numberOfTickets,float price,String cabinType,float totalPrice,String destination){
		this.bookingId = bookingId;
		this.departureDate = departureDate;
		this.numberOfTickets = numberOfTickets;
		this.price = price;
		this.cabinType = cabinType;
		this.totalPrice = totalPrice;
		this.destination = destination;
	}
	
	public float totalPrice(){
		totalPrice = (float)(price  * numberOfTickets);
		return totalPrice;
	}
}
