import java.util.*;
public class midterm01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int width,height;
		float fArea,fLen;
		
		System.out.print("�簢���� ���θ� �Է��Ͻÿ� : ");
		width=input.nextInt();
		System.out.print("�簢���� ���θ� �Է��Ͻÿ� : ");
		height=input.nextInt();
		
		fArea = width*height;
		fLen=(width+height)*2;
		System.out.println("�簢���� ���̴� "+fArea+"�Դϴ�.");
		System.out.println("�簢���� �ѷ��� "+fLen+"�Դϴ�.");
		

	}

}
