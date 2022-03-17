// 1에서 1000 사이의 정수 중 소수를 출력하는 프로그램 
public class Lec3Ex3 {

	public static void main(String[] args) {
		
		int cnt=0;
		for(int i=1; i<1000; i++) {
			for(int j = 1; j<i; j++) {
				if(i%j==0)
					cnt+=1;
			}
			if(cnt == 1)
				System.out.print(i+" ");
			cnt=0;
		}
		
	}

}
