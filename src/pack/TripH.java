package pack;

public class TripH {
 private String location;
 private String name;
 private String star;
 private int rooms;
 private String address;
 private long phone;
private double price;
 public void setStar(String star) 
 {
	 this.star=star;
 }
 public String getStar() 
 {
	 return star;
 }
 public void setLocation(String location) 
 {
	 this.location=location;
 }
 public String getLocation() 
 {
	 return location;
 }
 public void setName(String name) 
 {
	 this.name=name;
 }
 public String getName() 
 {
	 return name;
 }
  public void setPrice(double price)
 {
	 this.price=price;
 }
 public double getPrice() 
 {
	 return price;
 }
 public void setRooms(int rooms)
 {
	 this.rooms=rooms;
 }
 public int getRooms() 
 {
	 return rooms;
 }
 public void setAddress(String address)
 {
	 this.address=address;
 }
 public String getAddress() 
 {
	 return address;
 }
 public void setPhone(long phone)
 {
	 this.phone=phone;
 }
 public long getPhone() 
 {
	 return phone;
 }
}
