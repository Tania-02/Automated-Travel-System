package pack;

public class Tour1 {
 private String origin;
 private String dest;
 private String month,theme;
 private int meal ,seat,id;
 private double price;
 
 public void setSeat(int seat) 
 {
	 this.seat=seat;
 }
 public double getSeat()
 {
	 return seat;
 }
 ////////////////2
 public void setOrigin(String origin) 
 {
	 this.origin=origin;
 }
 public String getOrigin() 
 {
	 return origin;
 }
 ///////////////////3
 public void setDestination(String dest)
 {
	 this.dest=dest;
 }

 public String getDestination() 
 {
	 return dest;
 }
//////////////////4
 public String getTheme() 
 {
	 return theme;
 }
 public void setTheme(String theme)
 {
	 this.theme=theme;
 }
 ////////////////5
 public void setMonth(String month)
 {
	 this.month=month;
 }
 public String  getMonth() 
 {
	 return month;
 }
 /////////////6
 public void setMeal(int meal) 
 {
	 this.meal=meal;
 }
 public int  getMeal() 
 {
	 return meal;
 }
 /////////////7
 public void setPrice(double price) 
 {
	 this.price=price;
 }
 public double getPrice()
 {
	 return price;
 }
 //////////////
 public void setID(int id) 
 {
	 this.id=id;
 }
 public int getID()
 {
	 return id;
 }
 
}
