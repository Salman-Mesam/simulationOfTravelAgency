//Mohammad Salman Mesam
//Student ID: 260860161

public class BnBReservation extends HotelReservation {

	
	public BnBReservation(String nameonreservation , Hotel hotel , String typeofroom , int numberofnights) {
		super(nameonreservation, hotel, typeofroom, numberofnights);
		
	}
	
	public int getCost() {
		
		int cost= super.getCost()+ getNumOfNights()*1000;
		return cost;
	}
	
}
