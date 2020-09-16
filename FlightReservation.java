//Mohammad Salman Mesam
//Student ID: 260860161


public class FlightReservation extends Reservation {

	private Airport departure;
	private Airport arrival;
	
	
	public FlightReservation(String nameonReservation, Airport dep , Airport arrive) {
		super(nameonReservation);
		
		if(dep.equals(arrive)){
			throw new IllegalArgumentException("The two input airports are the same");
		} 
		
		
		departure=dep;
		arrival=arrive;
		
		
		
		//why not use tostring()??
	}


	public int  getCost() {
	
		int costpergallon = 124;
		double range = 167.52;
		int extra = 5375;
		double distanceforfuel = (double) Airport.getDistance(departure,arrival)/range;
		int cost = (int) Math.ceil((distanceforfuel*costpergallon+extra+departure.getFees()+arrival.getFees()));
	  
		
		return cost;
		
	}

	
	public boolean equals(Object obj) {
	 if(obj instanceof FlightReservation && ((FlightReservation) obj).reservationName()==this.reservationName()
			 && ((FlightReservation) obj).departure==this.departure
			 && ((FlightReservation) obj).arrival==this.arrival) {
		 return true;
	 }

 	return false;
	}
	
	
	
	 //		if(r.FlightReservation(nameonReservation,dep,arrive).equals(r.getType(),))
 
}


	
	
	
	

