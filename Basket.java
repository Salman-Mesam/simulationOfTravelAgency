//Mohammad Salman Mesam
//Student ID: 260860161


public class Basket {
	private Reservation [] Reservations;
	

	
	
	public Basket() {
		this.Reservations=new Reservation[0];
		
	}
	
	public Reservation[] getProducts() {
		Reservation [] shallowcopy = new Reservation [Reservations.length];
		for(int i=0;i<Reservations.length;i++) {
			shallowcopy[i]=Reservations[i];
			
		}
		return shallowcopy; //pointer of this equals pointer of that
	}
	
	public int add(Reservation r) {
		
		if(Reservations.length==0) {
			Reservations = new Reservation[1];
			 Reservations[0]=r;
			 return Reservations.length;
			
		}
		
		Reservation[] thenewguy = new Reservation[Reservations.length+1];
		
		for(int i=0;i<Reservations.length;i++) {
		thenewguy [i] = Reservations[i];
	   
				
		}
		 
		thenewguy[Reservations.length]= r;
	
		this.Reservations=thenewguy;;
		return thenewguy.length;
		
	}
	
	public boolean remove(Reservation k) {
		
		
		int j=85;
		for(int i =0;i<Reservations.length;i++) {
			if(k.equals(Reservations[i]) || j==1){
				if(i==Reservations.length-1) {
				} else {
					
				Reservations[i]=Reservations[i+1];
				j=1;
				}
			}
		}
				
				if(j==1) {
					Reservation[] thebadguy = new Reservation[Reservations.length-1];
					for(int c=0;c<Reservations.length-1;c++) {
					thebadguy[c]=Reservations[c];
					}	
					this.Reservations=thebadguy;
					return true;
					
				}else return false;
				
			
		
	}
	
	
	public void clear () {
		for(int i=0;i<Reservations.length;i++) {
			Reservations[i]= null;
		
		
	}
		Reservations=new Reservation[0];
	}
	
	public int getNumOfReservations() {
		return Reservations.length;
	}
	
	
	
	public int getTotalCost() {
		int cost  = 0 ;
		
		for(int i=0;i<Reservations.length;i++) {
			cost+=Reservations[i].getCost();
			
		}
		return cost;
		
	}
	
	
	
}
