package pack;


public class Bus {
	int id;
 private String dept;
 private String origin;
 private String dest;
 private int seats;
private double rate;
private String type;
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
 public void setType(String type)
 {
	 this.type=type;
 }
 public String getType() 
 {
	 return type;
 }
 public void setRate(double rate)
 {
	 this.rate=rate;
 }
 public double getRate() 
 {
	 return rate;
 }
 public void setSeats(int seats)
 {
	 this.seats=seats;
 }
 public int getSeats() 
 {
	 return seats;
 }
 public void setDept(String dept) 
 {
	 this.dept=dept;
 }
 public String getDept() 
 {
	 return dept;
 }
 public void setID(int id) 
 {
	 this.id=id;
 }
 public int getID() 
 {
	 return id;
 }
}
