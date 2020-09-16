//Mohammad Salman Mesam
//Student ID: 260860161

public class Room {
	private String roomtype;
	private int roomprice;
	private boolean roomavailability;
	
	
	
	public Room(String type) {
		
		roomtype=type;// I believe this should be changed to roomtype=type;
		
	    if(roomtype.equalsIgnoreCase("double")) {
	    	roomprice=9000;
	    	roomavailability=true; 
	    } else if (roomtype.equalsIgnoreCase("queen")){
	    	roomprice=11000;
	    	roomavailability=true;
	    	
	    }else if (roomtype.equalsIgnoreCase("king")) {
	    	roomprice=15000;
	    	roomavailability=true;
	    }
	    else throw new IllegalArgumentException("This roomtype cannot be created");
			
			
		}
	
	public Room(Room a) {
		this.roomtype=a.roomtype; 
		this.roomprice=a.roomprice;
		this.roomavailability=a.roomavailability;
		 
		
	}
	
	public String getType() {
		return roomtype;
		
	}
	
	public int getPrice() {
		return roomprice;
	}
	
	public void changeAvailability() {
		if(roomavailability==true) {
			roomavailability=false;
			
		}else roomavailability=true;
		
	}
		
    public static Room findAvailableRoom(Room[] r,String typeofroom){
    
    	//how do I make sure that the room it returns has a status of availabile cuz what I have done is just roomavailability??
    	
    	for(int i=0;i< r.length; i++) {
    		
    		
    		
       if(r[i].roomtype.equals(typeofroom)&& r[i].roomavailability) {
   
    			return r[i];
    			}

            
    			
    	}
		return null;
    			}
    	
    
    
    public static boolean  makeRoomAvailable (Room[] r , String typeofroom) {
    	
    	
    	for(int i=0;i< r.length; i++) {
    		if((r[i].getType().equalsIgnoreCase(typeofroom)) && (r[i].roomavailability==false)) {
    			r[i].changeAvailability();
    			return true;
    			
    		}
    	}
    			return false;
    		
    }

    		
    	
    	
    
    
    
   
		
		
		
		
		}
		
    
    
   
  
    
		
		
		



	
	


