//Mohammad Salman Mesam
//Student ID: 260860161

public abstract class Reservation {
	private String name;
	
	
	
	public Reservation(String args) {
		name=args;
		
		
	}
	 public  final String reservationName(){
		 return name;
		 
	 }
	 
	 public abstract int getCost() ;  //I expect implementation in coming up classes
	 
	 
	 
	 public abstract boolean equals(Object r);
	 
	 
}
