import java.util.*;
public class 인사말출력하기 {

	public static void main(String[] args) {
		Date date = new Date();
		int currenHour = date.getHours();
		
		System.out.println("현재 시각은: "+date);
		if(currenHour < 11)
			System.out.println("Good Morning");
		else if(currenHour <18)
			System.out.println("Good evening");
		else
			System.out.println("Good nigth");
		
		

	}

}
