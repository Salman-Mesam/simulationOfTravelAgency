
//Mohammad Salman Mesam
//Student ID: 260860161

public class Customer {
	private String name;
	private int balanceCustomer;
	private Basket customerReservations;
	
	
	
	public Customer(String nameofcustomer, int initialbalance) {
		this.name=nameofcustomer;
		this.balanceCustomer=initialbalance;
		this.customerReservations=null;
		
		
	}
	
	public String getName() {
		return name;
	}
	
	public int  getBalance() {
		return balanceCustomer;
	}
	
	
	public Basket getBasket() {
		return customerReservations;
	}
	
	public int addFunds(int toAdd) {
		if(toAdd<0) {
			throw new IllegalArgumentException("Balance is negative");}
		
			balanceCustomer+=toAdd;
			return balanceCustomer;
			
			}
	
	public int addToBasket(Reservation r) {
		if(r.reservationName().equals(this.name)) {
			if(customerReservations==null) customerReservations= new Basket();
			customerReservations.add(r);
			return customerReservations.getNumOfReservations();	
		}else throw new IllegalArgumentException("Reservation name does not match");
		

	}
	
	public int addToBasket(Hotel hotel,String typeofroom,int numberofNights,boolean breakfast) {
		Reservation r;
		if(breakfast) {
			r= new BnBReservation(name,hotel,typeofroom,numberofNights);
		}else{r= new HotelReservation(name,hotel,typeofroom,numberofNights);
		}
		customerReservations.add(r);
		return customerReservations.getNumOfReservations();
	}
	
	
	public int addToBasket(Airport a,Airport b) {
		
	Reservation r= new FlightReservation(name,a,b);
	customerReservations.add(r);
	return customerReservations.getNumOfReservations();
	
	
	}
	
	public boolean removeFromBasket(Reservation r) {
		return customerReservations.remove(r);
	}
	
	
	public int checkOut() {
		if(balanceCustomer<customerReservations.getTotalCost()) {
			throw new IllegalStateException("You are broke");	
		}else {
			balanceCustomer-=customerReservations.getTotalCost();
			customerReservations.clear();
			return balanceCustomer;
		}
	}
	}



