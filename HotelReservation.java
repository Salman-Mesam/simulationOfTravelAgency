//Mohammad Salman Mesam
//Student ID: 260860161

public class HotelReservation extends Reservation {
	
	private Hotel wherereservation;
	private String typeofroom;
	private int numberofnights;
	private int pricefortypeofroom;

	public HotelReservation(String nameonthereservation, Hotel reservation, String typeofroom , int numbernights) {
		super(nameonthereservation);
		pricefortypeofroom=reservation.reserveRoom(typeofroom);
		this.wherereservation=reservation;
		this.typeofroom=typeofroom;
		this.numberofnights=numbernights;
		
	
	}
	public int getNumOfNights() {
		return numberofnights;
	}
	
	public int getCost() {
		//System.out.println(numberofnights);
		int cost = getNumOfNights()*pricefortypeofroom;
		return cost;
		
	}
	
	
	public boolean equals(Object objj) {
		if(objj instanceof HotelReservation && ((HotelReservation) objj).reservationName()==this.reservationName() && ((HotelReservation) objj).wherereservation==this.wherereservation && ((HotelReservation) objj).typeofroom==this.typeofroom && ((HotelReservation) objj).numberofnights==this.numberofnights&& ((HotelReservation) objj).pricefortypeofroom==this.pricefortypeofroom) {
			 return true;
	}else
		return false;

}
}
