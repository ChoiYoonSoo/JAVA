import java.util.*;
public class midterm01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int width,height;
		float fArea,fLen;
		
		System.out.print("사각형의 가로를 입력하시오 : ");
		width=input.nextInt();
		System.out.print("사각형의 세로를 입력하시오 : ");
		height=input.nextInt();
		
		fArea = width*height;
		fLen=(width+height)*2;
		System.out.println("사각형의 넓이는 "+fArea+"입니다.");
		System.out.println("사각형의 둘레는 "+fLen+"입니다.");
		

	}

}
