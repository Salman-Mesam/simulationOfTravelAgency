//Mohammad Salman Mesam
//Student ID: 260860161
public class Hotel {
	private String hotelname;
	private Room[] r;

	public Hotel(String a, Room[] RR) {
		hotelname = a;
		this.r = new Room[RR.length]; // I am initialising my private field r wth an array Room[] of length RR.length

		for (int i = 0; i < RR.length; i++) {
			this.r[i] = new Room(RR[i]); // here i am calling my constructor to create objects for each value of i (
											// onto every element of my array r that is r[i]) and hence every element in
											// my array r is created using
		} // room constructor from the room class so for every i in my array r I have the
			// roomtype,room pric and room availability created (these are the fields
			// initialised for every i in r )
	}

	public int reserveRoom(String typeofroom) {
		Room room = Room.findAvailableRoom(this.r,typeofroom);
		if (room == null) {
			throw new IllegalArgumentException("roomtype mismatch");
		}
		room.changeAvailability();
		return room.getPrice();
	}
		
		

		

	public boolean cancelRoom(String typeofroom) {
    
		return Room.makeRoomAvailable(this.r, typeofroom);
	
	}
	
	

	public static void main(String[] args) {
		Room r1 = new Room("king");
		Room r2 = new Room("queen");
		Room r3 = new Room("double");

		Room raray[] = { r1, r2, r3 };
		Hotel h1 = new Hotel("Hilton", raray);

		System.out.println(h1.reserveRoom("king"));
		System.out.println(h1.reserveRoom("king"));
		System.out.println(h1.reserveRoom("double"));

		System.out.println(h1.reserveRoom("hudidi"));

	}
}
