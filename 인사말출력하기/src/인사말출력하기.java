import java.util.*;
public class �λ縻����ϱ� {

	public static void main(String[] args) {
		Date date = new Date();
		int currenHour = date.getHours();
		
		System.out.println("���� �ð���: "+date);
		if(currenHour < 11)
			System.out.println("Good Morning");
		else if(currenHour <18)
			System.out.println("Good evening");
		else
			System.out.println("Good nigth");
		
		

	}

}
