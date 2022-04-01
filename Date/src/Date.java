
public class Date {

	 private int year;
	 private String month;
	 private int day;
	 
	 public Date() {
		 this(2015,"8¿ù",10);
	 }
	 
	 public Date(int y) {
		 this(y,"1¿ù",1);
	 }
	 
	 public Date(int y, String m, int d) {
		 this.year=y;
		 this.month=m;
		 this.day=d;
	 }
	 
	 public String toString() {
		 return "[year="+year+", month="+month+", day="+day+"]";
	 }

}
