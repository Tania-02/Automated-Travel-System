package pack;
public class User {
 private String name;
 private String email;
 private String password,bookingid,username;
 private long  phone;
 ///////////////1
 public void setPhone(long phone) 
 {
	 this.phone=phone;
 }
 public double getPhone()
 {
	 return phone;
 }
 ////////////////2
 public void setName(String name) 
 {
	 this.name=name;
 }
 public String getName() 
 {
	 return name;
 }
 ///////////////////3
 public void setEmail(String email)
 {
	 this.email=email;
 }

 public String getEmail() 
 {
	 return email;
 }
//////////////////4
 public String getPassword() 
 {
	 return password;
 }
 public void setPassword(String password)
 {
	 this.password=password;
 }
 ////////////////5
 public void setBookingid(String bookingid)
 {
	 this.bookingid=bookingid;
 }
 public String  getBookingid() 
 {
	 return bookingid;
 }
 /////////////6
 public void setUsername(String username) 
 {
	 this.username=username;
 }
 public String  getUsername() 
 {
	 return username;
 }

 
}
