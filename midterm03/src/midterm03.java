
public class midterm03 {
	
	public void sum(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	public void sum(int n1, int n2,int n3) {
		System.out.println(n1+n2+n3);
	}
	
	public static void main(String[] args) {
		midterm03 obj = new midterm03();
		obj.sum(10,20,30);
		obj.sum(10,20);

	}

}
