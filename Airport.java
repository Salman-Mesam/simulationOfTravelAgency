
//Mohammad Salman Mesam
//Student ID: 260860161

public class Airport {
   private int xcoordinate;
   private int ycoordinate;
   private int feesincents;
   
   public Airport (int x, int y , int p) {
	   xcoordinate=x;
	   ycoordinate=y;
	   feesincents=p;
   }
   
   
   public int getFees() {
	   return feesincents;
   }
   
   public static int getDistance(Airport a , Airport b) {

	   int distance = (int) Math.ceil(Math.sqrt(Math.pow(a.xcoordinate-b.xcoordinate,2)+Math.pow(a.ycoordinate-b.ycoordinate,2)));
	   return distance;
			   
   }
   
   public static void main(String[] args) {
	   Airport a = new Airport(102,20,50);
	   Airport b =new Airport(15,25,30);
	   
	   
	  double test = getDistance(a, b);
	   System.out.println(test);
	   
   }
   
}
