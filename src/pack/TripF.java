package pack;

public class TripF {
 private String date;
 private String origin;
 private String dest;
 private double price;
 private String flight;
 private int seats,id;
 public void setFlight(String flight) 
 {
	 this.flight=flight;
 }
 public String getFlight() 
 {
	 return flight;
 }
 public void setDate(String date) 
 {
	 this.date=date;
 }
 public String getDate() 
 {
	 return date;
 }
 public void setOrigin(String origin) 
 {
	 this.origin=origin;
 }
 public String getOrigin() 
 {
	 return origin;
 }
 public void setDestination(String dest)
 {
	 this.dest=dest;
 }
 public String getDestination() 
 {
	 return dest;
 }
 public void setPrice(double price)
 {
	 this.price=price;
 }
 public double getPrice() 
 {
	 return price;
 }
 public void setSeats(int seats)
 {
	 this.seats=seats;
 }
 public int getSeats() 
 {
	 return seats;
 }
 public void setId(int id)
 {
	 this.id=id;
 }
 public int getId() 
 {
	 return id;
 }
}
